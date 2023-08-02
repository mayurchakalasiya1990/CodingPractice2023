package grokking.code.slidnigwindow;

import java.util.Arrays;

public class MaxSumOfSubArrayOfSizeK {

    public static int maxSumOfSubArrayOfSizeK(int k, int[] arr){
        int result=0;
        int windowStart=0;
        //int windowEnd=0;
        int windowSum=0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum+= arr[windowEnd];
            if(windowEnd >= k-1){
                result = Math.max(result,windowSum);
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double result=MaxSumOfSubArrayOfSizeK.maxSumOfSubArrayOfSizeK(5,new int[]{1,3,2,6,-1,4,1,8,2});
        System.out.println("Result:"+ result);
    }
}
