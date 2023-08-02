package deadlock;

import java.util.Random;

public class DeadLockSolution {

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        Thread trainA=new Thread(new TrainA(intersection));
        Thread trainB=new Thread(new TrainB(intersection));
        trainB.setName("Train-B");
        trainA.setName("Train-A");
        trainA.start();
        trainB.start();

    }

    static class TrainB implements Runnable{
        private Intersection intersection;
        private Random random = new Random();
        public TrainB(Intersection intersection){
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while(true){
                long sleepTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                intersection.takeRoadB();
            }
        }
    }
    static class TrainA implements Runnable{
        private Intersection intersection;
        private Random random = new Random();
        public TrainA(Intersection intersection){
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while(true){
                long sleepTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                intersection.takeRoadA();
            }
        }
    }

    public static class Intersection{
        private Object roadA=new Object();
        private final Object roadB=new Object();

        public void takeRoadA(){
            synchronized (roadB){
                System.out.println("Lock is acquired on the Road B by Train:"+Thread.currentThread().getName());
                synchronized (roadA){
                    System.out.println("Lock is acquired on the Road A by Train:"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"  is passing through Road A");
                }
            }
        }

        public void takeRoadB(){
            synchronized (roadB){
                System.out.println("Lock is acquired on the Road B by Train:"+Thread.currentThread().getName());
                synchronized (roadA){
                    System.out.println("Lock is acquired on the Road A by Train:"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"  is passing through Road B");
                }
            }
        }
    }
}
