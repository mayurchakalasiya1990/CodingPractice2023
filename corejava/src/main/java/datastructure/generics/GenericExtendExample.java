package datastructure.generics;

import java.util.ArrayList;
import java.util.List;

class X1{

}
class A1 extends X1{

}

class B1 extends  A1{

}

class C1 extends  B1{

}
public class GenericExtendExample {
    public static void main(String[] args) {
        List<? extends X1> list= new ArrayList();
     //   list.add(new A1());
    }
}
