package leetcode_150.array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] postfixArr = new int[nums.length];
        int[] ans = new int[nums.length];
        prefixArr[0] = 1;
        //System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
              prefixArr[i] = nums[i-1] * prefixArr[i-1];
        }
        //System.out.println(Arrays.toString(prefixArr));
        postfixArr[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            postfixArr[i] = nums[i+1] * postfixArr[i+1];
        }
        //System.out.println(Arrays.toString(postfixArr));
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixArr[i] * postfixArr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
