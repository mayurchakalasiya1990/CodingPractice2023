package datastructure.designpattern.creational.singleton;

public enum SingletonEnum {

    INSTANCE;
    public String toString(){
        return getDeclaringClass().getCanonicalName()+'@'+hashCode();
    }
}
