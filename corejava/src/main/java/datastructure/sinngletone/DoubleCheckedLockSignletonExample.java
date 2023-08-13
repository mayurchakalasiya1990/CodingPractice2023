package datastructure.sinngletone;

public class DoubleCheckedLockSignletonExample {
    private DoubleCheckedLockSignletonExample(){ }

    private static DoubleCheckedLockSignletonExample instance;

    public static DoubleCheckedLockSignletonExample getInstance(){
        DoubleCheckedLockSignletonExample localRef=instance;
        if(localRef == null){
            synchronized (DoubleCheckedLockSignletonExample.class){
                localRef = instance;
                if(localRef == null){
                    instance = localRef = new DoubleCheckedLockSignletonExample();
                }
            }
        }
        return instance;
    }
}
