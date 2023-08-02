package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreExample {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        ExecutorService service = Executors.newFixedThreadPool(50);
        IntStream.of(1000).forEach(i->service.submit(new Task(semaphore)));
        service.shutdown();
        service.awaitTermination(5, TimeUnit.MINUTES);
    }

    private static class Task implements Runnable {
        private Semaphore semaphore;
        public Task(Semaphore semaphore) {
            this.semaphore = semaphore;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("Permit acquired by  "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();
                System.out.println("Permit release by  "+Thread.currentThread().getName());
            }

        }
    }
}
