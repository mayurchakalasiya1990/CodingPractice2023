package leetcode_150.Hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int[] result = new int[2];
        HashMap<Integer,Integer> sumMap=new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(sumMap.containsKey(target-nums[i])){
                result[0] = sumMap.get(target-nums[i]);
                result[1] = i;
                return result;
            }else{
                sumMap.put(nums[i],i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
}
