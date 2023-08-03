import java.util.Arrays;

/*

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 | Output: [1,2,2,3,5,6]
Input: nums1 = [1], m = 1, nums2 = [], n = 0 | Output: [1]
Input: nums1 = [0], m = 0, nums2 = [1], n = 1 | Output: [1]

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109

 */
public class Problem3 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        /*int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;*/
/*
        int[] nums1 = {1};
        int m = 0;
        int[] nums2 = {0};
        int n = 1;
*/
        int j=0;
        for (int i = 0; i < nums1.length; i++) {

            if (m > 0  && m >= i+1 && (n > 0 && nums1[i] < nums2[j])){
            }else if(n > 0 && n >= j + 1 && (m == 0 || m < i+1 || (m > 0 && nums1[i] >= nums2[j]))){
                if(m > 0 &&  m >= i+1){
                    rightShiftByOne(nums1, i);
                }
                nums1[i]=nums2[j];
                if(nums1[i+1] == nums2[j]){
                    i++;
                }
                j++;

            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    private static void rightShiftByOne(int[] nums1, int i) {
        //shift array by 1 position
        for (int l = nums1.length-1; l >= i; l--) {
            nums1[l] = nums1[l-1];
        }
        System.out.println("After shift:"+Arrays.toString(nums1));
    }

}
