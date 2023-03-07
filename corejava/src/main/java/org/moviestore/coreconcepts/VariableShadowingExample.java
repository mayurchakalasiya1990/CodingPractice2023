package org.example.coreconcepts;

public class VariableShadowingExample {

    int age=10;
    String name="Mayur";

    public static void main(String[] args) {

        int age=10;
        String name="Mayur";

        /*
        When a local variable inside a method   has the same name as one of the instance variables,
        the local variable shadows the instance variable inside the method block.
         */
        System.out.println("Age::"+age);
        System.out.println("Name::"+name);
        /*
            System.out.println("Age::"+this.age);
            System.out.println("Name::"+this.name);
         */

    }

}
