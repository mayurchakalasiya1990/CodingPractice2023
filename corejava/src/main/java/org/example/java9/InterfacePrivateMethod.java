package org.example.java9;

public interface InterfacePrivateMethod {



    private int sumInt(int a, int b){
        return a+b;
    }

    private double sumDouble(double a, double b){
        return a+b;
    }

    default double sum(String sumType, double a, double b){

        double c=0;
        if(sumType.equals("int")){
            c = sumInt((int)a,(int)b);
        } else if (sumType.equals("double")) {
            c = sumDouble(a,b);
        }
        return c;
    }

}
