package org.example.designpattern.creational.singleton;


/*
1. Thread Safe
2. prevent from reflection
3. can't create object from constructor

 */
public class Singleton {

    private Singleton(){
        if(instance == null){
            instance = this;
        }else{
            throw new IllegalArgumentException("Already Initialized..");
        }
    }

    //private static final Singleton instance =new Singleton();
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
