package datastructure.sinngletone;

public class LazyInitiSignletonExample {
    private static LazyInitiSignletonExample instance;
    private LazyInitiSignletonExample(){}
    public static LazyInitiSignletonExample getInstance(){
        if(instance == null){
            instance = new LazyInitiSignletonExample();
        }
        return instance;
    }
}
