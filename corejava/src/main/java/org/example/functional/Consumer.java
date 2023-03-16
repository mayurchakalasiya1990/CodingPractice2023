package org.example.functional;

import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List list = List.of(1,2,3,4,5,6);
        list.stream().forEach(element -> System.out.println(element));
    }
}
