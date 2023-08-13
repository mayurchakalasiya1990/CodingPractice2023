package leetcode_150.array;

import java.util.Arrays;

public class MajorityElementFromArray {


    public static int majorityElement(int[] nums) {
        int majorityThr=0,count=0, prevCount = 0, index=-1;
        Arrays.sort(nums);
        System.out.println();
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
                if(count > majorityThr && count >= prevCount){
                    index = i;
                    prevCount = count;
                }
            }else{
                count = 0;
            }
        }
        return nums[index];
    }

    public static void main(String[] args) {
        int[] nums = {6,6,6,7,7};
        System.out.println(majorityElement(nums));
    }
}
