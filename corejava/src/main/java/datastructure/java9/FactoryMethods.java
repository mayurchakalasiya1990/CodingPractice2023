package datastructure.java9;

import java.util.*;

public class FactoryMethods {
    public static void main(String[] args) {
        List<String> strings = List.of("1","2","3");
        Set<String> stringSet= Set.of("1","2","3","4");
        Map<String, Integer> map= Map.of("1",1,"2",2,"3",3);
        //strings=new ArrayList<>();
        System.out.println("List of String:"+strings);
        System.out.println("Set of String:"+stringSet);
        System.out.println("Map:"+map);
    }
}

