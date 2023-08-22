package leetcode_150.Hashmap;

import java.util.*;

/*

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */
public class ContainsDuplicate_II {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        //naiveSolution(nums, k);
        boolean isContainDuplicate = false;
        Map<Integer, List> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!numberMap.containsKey(nums[i])){
                List<Integer> numberIndex = new ArrayList<>();
                numberIndex.add(i);
                numberMap.put(nums[i],numberIndex);
            }else {
                numberMap.get(nums[i]).add(i);
            }
        }
        for (List<Integer> list: numberMap.values()) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    if(Math.abs(list.get(i)-list.get(j)) <= k){
                        isContainDuplicate = true;
                        break;
                    }
                }
                if(isContainDuplicate){
                    break;
                }
            }
        }
        System.out.println(numberMap);
        System.out.println(isContainDuplicate);
    }

    private static void naiveSolution(int[] nums, int k) {
        int start=0, end = 0;
        boolean isContainDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            start = i+1;
            end = nums.length-1;
            while(start <= end){
                if((nums[start] == number)){
                    if(Math.abs(i-start) <= k){
                        isContainDuplicate = true;
                        break;
                    }
                }
                start++;
                if(nums[end] == number){
                    if(Math.abs(i-end) <= k){
                        isContainDuplicate = true;
                        break;
                    }
                }
                end--;
            }
            if(isContainDuplicate){
                break;
            }
        }
        System.out.println("is Contain Duplicate? "+ isContainDuplicate);
    }
}
