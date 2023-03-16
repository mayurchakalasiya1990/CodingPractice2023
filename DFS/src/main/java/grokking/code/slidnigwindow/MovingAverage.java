package grokking.code.slidnigwindow;

import java.util.Arrays;

public class MovingAverage {

    public static double[] movingAverage(int k, int[] arr) {
        double[] result=new double[arr.length-k+1];
        int windowStart =0;
        int windowEnd=0;
        double windowSum = 0;

        for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if(windowEnd >= k-1){
                result[windowStart] = windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double result[]=MovingAverage.movingAverage(5,new int[]{1,3,2,6,-1,4,1,8,2});
        System.out.println("Average of subarrays of size K:"+Arrays.toString(result));
    }
}
