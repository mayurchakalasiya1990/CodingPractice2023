import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScatterAndGatherCompletableFutureMethodProblem {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(getPrice());
    }

    private static Set<Integer> getPrice() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
        CountDownLatch latch = new CountDownLatch(3);
        executorService.execute(new FetchProductProductPriceThread("1001",prices,1000,latch));
        executorService.execute(new FetchProductProductPriceThread("1002",prices,1500,latch));
        executorService.execute(new FetchProductProductPriceThread("1003",prices,3200,latch));
        latch.await(3000, TimeUnit.MILLISECONDS);
        executorService.shutdown();
        return prices;
    }

    private static class FetchProductProductPriceThread implements Runnable{
        private String productId;
        private Set<Integer> prices;
        private long processingTime;
        private CountDownLatch latch;

        public FetchProductProductPriceThread(String productId, Set<Integer> prices, long mills, CountDownLatch latch) {
            this.prices=prices;
            this.productId = productId;
            this.processingTime = mills;
            this.latch = latch;
        }
        @Override
        public void run() {
            try {
                System.out.println("Fetching Price for product:"+productId);
                Thread.sleep(processingTime);
                int price =new Random().nextInt(100);
                prices.add(price);
                latch.countDown();
                System.out.println("product:"+productId+" Price:"+ price);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
