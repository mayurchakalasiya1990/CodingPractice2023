package org.example.generics;


import java.util.ArrayList;
import java.util.List;

class X{

}
class A extends X{

}

class B extends  A{

}

class C extends  A{

}

public class GenericSuperExample {

    public static void main(String[] args) {
        List<? super A> list= new ArrayList<>();
        list.add(new A());    }
}
