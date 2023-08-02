package org.example.generics;


import java.util.ArrayList;
import java.util.List;

class X{

}
class A extends X{

}

class B extends  A{

}

class C extends  B{

}

public class GenericSuperExample {

    public static void main(String[] args) {
        List<? super A> list= new ArrayList<>();
        list.add(new C()); // valid scenarion
        list.add(new A()); // valid scenarion
        list.add(new B()); // valid scenarion
        //list.add(new X()); // invalid scenarion
    }
}
