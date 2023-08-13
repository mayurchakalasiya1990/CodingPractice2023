package datastructure.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericMap {
    public static void main(String[] args) {

        Map<Integer, String> map= new HashMap<Integer,String>();
        map.put(1,"Mayur");
        map.put(2,"Nilesh");
        map.put(3,"Mayur");

        Iterator<Integer> keys=map.keySet().iterator();

        while (keys.hasNext()){
            Integer key = keys.next();
            System.out.println(map.get(key));
        }
    }

}
