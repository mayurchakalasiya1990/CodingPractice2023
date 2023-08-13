package datastructure.sinngletone;

public class ThreadSafeSingletonExample {
    private ThreadSafeSingletonExample(){ }

    private static ThreadSafeSingletonExample instance;
    public synchronized static ThreadSafeSingletonExample getInstance(){
        if(instance==null){
            instance = new ThreadSafeSingletonExample();
        }
        return instance;
    }
}
