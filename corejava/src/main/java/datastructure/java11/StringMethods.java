package datastructure.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        multilineString.lines().forEach(System.out::println);
        // remove blank lines
        List<String> stringList = multilineString.lines().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        System.out.println(stringList);

    }
}
