package org.example.sinngletone.preventbreak;

import java.io.Serializable;

public class SerializationPrevent  implements Serializable {
    private static final long serialVersionUID = -2020L;

    private SerializationPrevent(){}

    public static final SerializationPrevent instance = new SerializationPrevent();

    protected Object readResolved(){
        System.out.println("readResolve() method is called.");
        return instance;
    }
}
