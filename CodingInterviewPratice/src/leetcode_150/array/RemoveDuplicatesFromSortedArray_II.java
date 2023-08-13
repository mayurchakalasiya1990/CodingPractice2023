package leetcode_150.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_II {
    public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int count = 0;
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
                if(count < 2){
                    nums[index++] = nums[i];
                }
            }else{
                nums[index++] = nums[i];
                count = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

}
