package leetcode_150.Hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int input = 19;
        Set<Integer> st = new HashSet<>();
        while(true){
            int number = numberSqrAndSum(input);
            System.out.println(number);
            if(number==1){
                System.out.println("Happy number");
                break;
            }else if (st.contains(number)){
                System.out.println("Not Happy number");
                break;
            }
            st.add(number);
            input = number;
        }
        System.out.println(st);
    }

    public static int numberSqrAndSum(int number){
        int sum = 0;
        while(number!=0){
            sum += (number%10) * (number%10);
            number = number/10;
        }
        return sum;
    }
}
