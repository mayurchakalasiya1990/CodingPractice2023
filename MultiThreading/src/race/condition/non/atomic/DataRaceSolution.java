package race.condition.non.atomic;

import java.util.Random;

public class DataRaceSolution {

    public static void main(String[] args) {
        Metric metric=new Metric();
        BusinessLogic businessLogic1=new BusinessLogic(metric);
        BusinessLogic businessLogic2=new BusinessLogic(metric);
        MetricsPrinter metricsPrinter=new MetricsPrinter(metric);
        businessLogic2.start();
        businessLogic1.start();
        metricsPrinter.start();
    }

    public static class MetricsPrinter extends Thread{
        private Metric metric;

        public MetricsPrinter(Metric metric){
            this.metric = metric;
        }
        @Override
        public void run() {
            while (true){
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){

                }
                double currentAverage = metric.getAverage();
                System.out.println("Current Average is "+ currentAverage);
            }
        }
    }

    public static class BusinessLogic extends Thread{
        private Metric metric;
        private Random random=new Random();

        public BusinessLogic(Metric metric){
            this.metric = metric;
        }
        @Override
        public void run() {
            while (true){
                long start = System.currentTimeMillis();
                // Dummy Business Logic
                try{
                    Thread.sleep(random.nextInt(10));
                }catch (InterruptedException e){
                }
                long end = System.currentTimeMillis();
                metric.addSample(end-start);
            }
        }
    }
    public static class Metric{
        private long count=0;
        private volatile double average =0.0;

        public synchronized void addSample(long sample){
            double currentSum = average*count;
            count++;
            average = (currentSum + sample)/count;
        }

        public double getAverage(){
            return average;
        }
    }
}
