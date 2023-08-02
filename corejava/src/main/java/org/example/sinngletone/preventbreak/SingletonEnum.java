package org.example.sinngletone.preventbreak;

public enum SingletonEnum {
    INSTANCE;

    public void print(){
        System.out.println("Inside print method");
    }
}
