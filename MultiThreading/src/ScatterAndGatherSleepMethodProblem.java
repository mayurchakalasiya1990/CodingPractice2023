import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

public class ScatterAndGatherSleepMethodProblem {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        System.out.println(getPrice());
    }

    private static Set<Integer> getPrice() throws InterruptedException, ExecutionException, TimeoutException {
        Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
        CompletableFuture<Void> task1 = CompletableFuture.runAsync(new FetchProductProductPriceThread("1001",prices,1000));
        CompletableFuture<Void> task2 = CompletableFuture.runAsync(new FetchProductProductPriceThread("1002",prices,1500));
        CompletableFuture<Void> task3 = CompletableFuture.runAsync(new FetchProductProductPriceThread("1003",prices,3200));
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task3,task1,task2);
        allTasks.get(3,TimeUnit.SECONDS);
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
