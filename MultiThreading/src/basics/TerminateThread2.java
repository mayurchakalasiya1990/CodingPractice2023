package basics;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class TerminateThread2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("200000"),new BigInteger("100000000000")));
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();;
    }

    private static class LongComputationTask implements Runnable{

        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base+" "+power + "="+pow(base,power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power)!=0; i.add(BigInteger.ONE)) {
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Current Thread is interrupted");
                     return BigInteger.ONE;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}
