package grokking.code.slidnigwindow;

/*
https://www.youtube.com/watch?v=jKF9AcyBZ6E
 */
public class SmallestSubArrayWithGivenSum {
    public static int smallestSubArrayWithGivenSum(int[] arr, int s){
        int minLen = Integer.MAX_VALUE;
        // it will hold the size of smallest subarray
        // Integer.MAX_VALUE is the greatest number a int can hold
        // we need the minimum length/size so we will compare others with it.
        int windowSum = 0, windowStart = 0;
        // windowSum holds sum of the elements in that window
        // windowStart holds the starting position of current window

        for(int windowSize = 0; windowSize < arr.length; windowSize++) {
            // iterating through every element using windowEnd
            windowSum += arr[windowSize];
            // element is added to the window
            while(windowSum >= s) {
                // while windowSum is greater than equal to S
                minLen = Math.min(minLen, windowSize - windowStart + 1);
                // compares min len of window with the current window
                windowSum -= arr[windowStart];
                // removing the element at the start of the window
                windowStart++;
                // moving the window start position to the next place
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        // ternary operator:
        // if minLen is equal to Integer.MAX_VALUE means minimun window
        // with given sum greater than equal to S is not there. So, it
        // return 0 else it return minLen
    }

    public static void main(String[] args) {
        int result=SmallestSubArrayWithGivenSum.smallestSubArrayWithGivenSum(new int[]{2, 3, 1, 2, 4, 3},7);
        System.out.println("Result:"+result);
    }

}
