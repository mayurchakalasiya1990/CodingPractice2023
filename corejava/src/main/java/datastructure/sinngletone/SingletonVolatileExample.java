package datastructure.sinngletone;

public class SingletonVolatileExample {
    private SingletonVolatileExample(){ }

    private static volatile SingletonVolatileExample singletonVolatileExample;

    public static SingletonVolatileExample getInstance(){
        SingletonVolatileExample localRef=singletonVolatileExample;
        if(localRef == null){
            synchronized (SingletonVolatileExample.class){
                localRef = singletonVolatileExample;
                if(localRef == null){
                    singletonVolatileExample = localRef = new SingletonVolatileExample();
                }
            }
        }
        return singletonVolatileExample;
    }
}
