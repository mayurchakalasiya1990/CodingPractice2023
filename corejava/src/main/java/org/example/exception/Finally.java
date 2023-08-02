package org.example.exception;

public class Finally {

    static int sum(){
        try{
            System.out.println("Try");
            return 0;
            //System.exit(0);
        }catch (ArithmeticException e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally");
        }
        return 0;

    }
    public static void main(String[] args) {
        sum();
    }
}
