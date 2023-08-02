import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScatterAndGatherLatchMethodProblem {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(getPrice());
    }

    private static Set<Integer> getPrice() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
        executorService.execute(new FetchProductProductPriceThread("1001",prices,1000));
        executorService.execute(new FetchProductProductPriceThread("1002",prices,1500));
        executorService.execute(new FetchProductProductPriceThread("1003",prices,3100));
        Thread.sleep(3000);
        executorService.shutdown();
        return prices;
    }

    private static class FetchProductProductPriceThread implements Runnable{
        private String productId;
        private Set<Integer> prices;
        private long processingTime;
        public FetchProductProductPriceThread(String productId, Set<Integer> prices, long mills) {
            this.prices=prices;
            this.productId = productId;
            this.processingTime = mills;
        }
        @Override
        public void run() {
            try {
                System.out.println("Fetching Price for product:"+productId);
                Thread.sleep(processingTime);
                int price =new Random().nextInt(100);
                prices.add(price);
                System.out.println("product:"+productId+" Price:"+ price);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
