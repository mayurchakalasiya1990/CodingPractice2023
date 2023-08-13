package leetcode_150.array;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static int removeElement(int[] nums, int val) {
        int result =0, index=0;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[index++] = nums[i];

            }else{
                result++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-result;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums,val));

    }

}
