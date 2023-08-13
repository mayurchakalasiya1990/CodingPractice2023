package leetcode_150.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,6};
        //int[] arr = {1,2,3,3,3};
        int curr = 0;
        boolean isDuplicate=false;
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr); // log(n)
        for (int i = 0; i < arr.length; i++) {
            isDuplicate=false;
            curr = arr[i];
            while((i+1) < arr.length &&  curr == arr[i+1]){
                isDuplicate = true;
                i = i+1;

            }
            if(isDuplicate){
                i--;
            }else{
                result.add(arr[i]);
            }
        }

        System.out.println(result);
    }
}
