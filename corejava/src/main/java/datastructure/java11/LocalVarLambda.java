package datastructure.java11;

import lombok.NonNull;

import java.util.function.Function;

public class LocalVarLambda {
    public static void main(String[] args) {
        Function toString = (@NonNull var s1) -> s1.toString();
        String str= "Mayur Chakalasiya";
        System.out.println(toString.apply(str));
        System.out.println(toString.apply(null));
        //String _ = "";
    }
}
