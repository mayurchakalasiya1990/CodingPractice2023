package leetcode_150;

import java.util.Arrays;

/*
Input: digits = [1,2,3]
Output: [1,2,4]

Input: digits = [4,3,2,1]
Output: [4,3,2,2]

Input: digits = [9]
Output: [1,0]

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int[] digitSum = new int[0];

        if(digits[digits.length-1] < 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
            digitSum = digits;
        }else{
            for (int j = digits.length-1; j >= 0; j--) {
                if(digits[j] == 9){
                    if(j==0){
                        digits[j] = 0;
                        digitSum = Arrays.copyOf(digits,digits.length+1);
                        digitSum[0] = 1;
                        break;
                    }else{
                        digits[j] = 0;
                    }
                }else{
                    digits[j] = digits[j] + 1;
                    digitSum = digits;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(digitSum));
    }
}
