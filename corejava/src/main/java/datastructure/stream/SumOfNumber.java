package datastructure.stream;

import java.util.ArrayList;

public class SumOfNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(31);
        list.add(15);

        int total = list.stream().mapToInt(x->x).sum();
        System.out.println("Total:"+total);

    }
}
