package org.example.collection;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayList extends B{
    Integer i = 10;
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
    }

}
class B {

}
