package basics;

public class TerminateThread {

    public static void main(String[] args) {
        Thread thread=new Thread(new BlockingClass());
        thread.start();

        thread.interrupt();
    }
    private static class BlockingClass implements Runnable{
        public void run(){
            try{
                Thread.sleep(50000);
            }catch (InterruptedException e){
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
