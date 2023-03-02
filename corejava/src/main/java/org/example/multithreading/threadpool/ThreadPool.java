package org.example.multithreading.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class ThreadPool {

    private ArrayBlockingQueue<Runnable> taskQueue=null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int noOfThread, int maxNoOfTask){
        taskQueue = new ArrayBlockingQueue<Runnable>(maxNoOfTask);
        for (int i = 0; i < maxNoOfTask; i++) {
            PoolThreadRunnable poolThreadRunnable=new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }
        for (PoolThreadRunnable runnable: runnables) {
            //new Thread(runnable).start();
        }
    }

}
