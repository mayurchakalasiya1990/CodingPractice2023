package org.example.java9;

interface InterfaceExample {

    private static int sumInt(int a, int b){
        return a+b;
    }

    private static double sumDouble(double a, double b){
        return a+b;
    }

    static double sum(String sumType, double a, double b){

        double c=0;
        if(sumType.equals("int")){
            c = sumInt((int)a,(int)b);
        } else if (sumType.equals("double")) {
            c = sumDouble(a,b);
        }
        return c;
    }



}

public class InterfacePrivateMethod{
    public static void main(String[] args) {
        System.out.println(InterfaceExample.sum("int",10,20));
    }
}