package datastructure.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethod {



    public static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }
    public static void main(String[] args) {
        String element = "Mayur";

        List<String> stringList=new ArrayList<>();
        String theElement = addAndReturn(element,stringList);


        List<Integer> integerList=new ArrayList<>();
        Integer elementInt = Integer.parseInt("123");
        Integer a = addAndReturn(elementInt,integerList);


    }
}
