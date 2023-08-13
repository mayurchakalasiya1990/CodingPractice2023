package datastructure.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateNot {

    public static void main(String[] args) {
       List<String> sampliList = List.of("Java", " ", "Kotlin");
       List<String> stringWithList = sampliList.stream().filter(Predicate.not(String::isBlank))
               .collect(Collectors.toList());
        System.out.println(sampliList);
        System.out.println(stringWithList);

    }
}
