package basics;

public class HandleThreadException {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                 throw new RuntimeException("Runtime Exception from Thread:"+Thread.currentThread().getName());
            }
        });

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.println("A Critical error happen in thread "+ thread.getName()+ " the error is "+throwable.getMessage());
            }
        });
        thread.start();
    }
}
