package leetcode_150.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int f=0,r=0;
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            f= i+1;
            r = nums.length-1;
            while(f<r){
                sum = nums[i] + nums[f]+ nums[r];
                if(sum > 0){
                    r--;
                }else if(sum<0) {
                    f++;
                }else{
                    result.add(List.of(nums[i],nums[f],nums[r]));
                    f++;
                    //[-2,-2,0,2,2]
                    while(nums[f-1] == nums[f] && f < r){
                        f++;
                    }
                }
            }
        }
        return result;
    }
}
