package org.example.collection;

import java.util.ArrayList;

public class ArrayListToUniqueList<E> extends ArrayList {

    public boolean add(Object e){
        if(super.contains(e)){
            return false;
        }
        return super.add(e);
    }

    public static void main(String[] args) {
        ArrayListToUniqueList<Integer> list= new ArrayListToUniqueList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        list.stream().forEach(e -> System.out.println(e));
    }

}
