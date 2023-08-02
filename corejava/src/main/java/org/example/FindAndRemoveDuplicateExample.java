package org.example;

import java.util.Arrays;
import java.util.List;

public class FindAndRemoveDuplicateExample {
    public static void main(String[] args) {
        List<String> list= List.of("mayur","mayur","mayur1");
        list.stream().distinct().forEach(name -> System.out.println(name));

    }
}
