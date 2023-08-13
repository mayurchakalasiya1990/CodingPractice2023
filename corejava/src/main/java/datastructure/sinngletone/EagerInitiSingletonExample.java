package datastructure.sinngletone;

public class EagerInitiSingletonExample {
    private EagerInitiSingletonExample(){}

    private static EagerInitiSingletonExample instance;

    static{
        try{
            instance=new EagerInitiSingletonExample();
        }catch (Exception e){
            throw new RuntimeException("Exception while creating singleton object");
        }
    }
    public static EagerInitiSingletonExample getInstance(){
        return instance;
    }
}
