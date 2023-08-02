package executors.threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        // for scheduling of Tasks
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        System.out.println("Main TASK"+" "+ new Date(System.currentTimeMillis()));
        //task to run after 10 seconds delay
        service.schedule(() -> System.out.println("TASK1"+" "+ new Date(System.currentTimeMillis())), 10, TimeUnit.SECONDS);

        //task to run repeatedly every 10 seconds
        service.scheduleAtFixedRate(() -> System.out.println("TASK2"+" "+ new Date(System.currentTimeMillis())), 15, 10, TimeUnit.SECONDS);

        //task to run repeatedly 10 seconds after previous task completed
        service.scheduleWithFixedDelay(() -> System.out.println("TASK3"+" "+ new Date(System.currentTimeMillis())), 15, 10, TimeUnit.SECONDS);
    }
}
