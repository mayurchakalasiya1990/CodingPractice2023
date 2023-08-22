package leetcode_150.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        for (int i = 0; i < m; i++) {
            System.out.println(nums2[j]+" "+nums1[i]);
            if(nums2[j] < nums1[i]){
                int tmp = nums2[j];
                nums2[j]=nums1[i];
                nums1[i]=tmp;
                j++;
                System.out.println(Arrays.toString(nums1));
                System.out.println(Arrays.toString(nums2));
            }
        }
        j = 0;
        for (int i = m; i < nums1.length ;i++) {
            nums1[i] = nums2[j++];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1,m,nums2,n);

    }
}
