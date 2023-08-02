package executors.barriers;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatch1 {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch entryBarrier = new CountDownLatch(1);
        CountDownLatch exitBarrier = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Task(1000,"Thread-1", entryBarrier,exitBarrier));
        executorService.submit(new Task(2100,"Thread-2", entryBarrier,exitBarrier));
        executorService.submit(new Task(3200,"Thread-3", entryBarrier,exitBarrier));
        Thread.sleep(10);
        entryBarrier.countDown();
        System.out.println("Tasks are started.");
        exitBarrier.await();
        System.out.println("Tasks are completed.");
        executorService.shutdown();
    }

    private static class Task implements  Runnable{

        private long delay;
        private CountDownLatch entryBarrier;
        private CountDownLatch exitBarrier;

        private String threadName;

        public Task(long delay, String tName,CountDownLatch entryBarrier, CountDownLatch exitBarrier) {
            this.delay = delay;
            this.entryBarrier = entryBarrier;
            this.exitBarrier = exitBarrier;
            this.threadName = tName;
        }

        @Override
        public void run() {
            try {
                Thread.currentThread().setName(threadName);
                System.out.println("Thread started:"+Thread.currentThread().getName());
                entryBarrier.await();
                System.out.println("Thread Processing start:"+Thread.currentThread().getName());
                Thread.sleep(delay);
                System.out.println("Thread Processing stop:"+Thread.currentThread().getName());
                exitBarrier.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
