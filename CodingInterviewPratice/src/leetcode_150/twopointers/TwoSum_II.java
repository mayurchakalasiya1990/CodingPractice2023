package leetcode_150.twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum_II {
    public static int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);

        int f=0,r=numbers.length-1;
        int sum = 0;
        int[] result = new int[2];
        while(f<=r){
            sum = numbers[f] + numbers[r];
            if(sum < target){
                f++;
            }else if(sum > target){
                r--;
            }else{
                result[0] = f;
                result[1] = r;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
}
