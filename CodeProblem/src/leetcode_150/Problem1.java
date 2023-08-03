package leetcode_150;

import java.util.Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

 */
public class Problem1 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7} ;
        int k = 3;
        //rotateArrayByK(k, nums);
        reverseArray(0,nums.length-k-1,nums);
        reverseArray(nums.length-k,nums.length-1,nums);
        reverseArray(0,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int from, int to, int[] nums) {
        while (to > from){
            int temp  = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            from++;
            to--;
        }
    }

    private static void rotateArrayByK(int k, int[] nums) {
        int tmp = 0,  index=-1;
        for (int j = 0; j < k; j++) {
            int lastNumber = nums[nums.length-1];
            for (int i = nums.length-1; i>0 ; i--) {
                nums[i] = nums[i-1];
            }
            nums[0]=lastNumber;
        }
    }
}

