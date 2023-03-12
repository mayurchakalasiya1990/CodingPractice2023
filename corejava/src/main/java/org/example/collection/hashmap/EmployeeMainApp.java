package org.example.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMainApp {

    public static void main(String[] args) {
        Map<Employee, Integer> map=new HashMap<>();

        Employee e1=new Employee(32,"Mayur");
        Employee e2=new Employee(30,"Kalyani");
        Employee e3=new Employee(35,"Dipu");
        Employee e4=e3;

        System.out.println("e1 hashcode():"+e1.hashCode());
        System.out.println("e2 hashcode():"+e2.hashCode());
        System.out.println("e3 hashcode():"+e3.hashCode());
        System.out.println("e4 hashcode():"+e4.hashCode());

        map.put(e1,1000);
        map.put(e2,2000);
        map.put(e3,3000);
        map.put(e4,4000);

        System.out.println("e1.equals(e2):"+e1.equals(e2));
        System.out.println("e3.equals(e4):"+e3.equals(e4));

        System.out.println(map.get(e1));
        System.out.println(map.get(e2));
        System.out.println(map.get(e3));
        System.out.println(map.get(e4));
        System.out.println("HashMap Size:"+map.size());











    }
}

