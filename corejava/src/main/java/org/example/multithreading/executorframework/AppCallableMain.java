package org.example.multithreading.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppCallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int num = -5;
        Task task=new Task(num);
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Integer> result=executorService.submit(task);
        System.out.println("Result:"+result.get());
        executorService.shutdown();
    }
}
