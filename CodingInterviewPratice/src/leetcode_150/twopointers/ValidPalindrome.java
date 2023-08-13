package leetcode_150.twopointers;


/*

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean result = true;
        input = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(input);
        if(input.equals("")){
            System.out.println("true");
        }
        char[] inputArr = input.toCharArray();
        int start = 0;
        int end = input.length()-1;

        while(start < end){
            System.out.println(inputArr[start]+" "+inputArr[end]);
            if(inputArr[start]!=inputArr[end]){
                System.out.println(inputArr[start]+" "+inputArr[end]);
                result = false;
            }
            start++;
            end--;
        }
        System.out.println(result);
        //return true;
    }

}
