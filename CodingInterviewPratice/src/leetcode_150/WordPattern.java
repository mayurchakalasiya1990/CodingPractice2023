package leetcode_150;

import java.util.Arrays;
import java.util.HashMap;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.



Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.

 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println("word pattern:"+wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] s1=s.split(" ");
        System.out.println(Arrays.toString(s1));
        HashMap<String,String> patternMapping = new HashMap<>();
        if(pattern.length() != s1.length){
            return false;
        }
        String p="";
        for (int i = 0; i < s1.length; i++) {
            p = String.valueOf(pattern.charAt(i));
            System.out.println(patternMapping);
            if(patternMapping.containsKey(p)){
                if(!patternMapping.get(p).equals(s1[i]))
                    return false;
            }else{
                if(patternMapping.containsValue(s1[i]))
                    return false;
                patternMapping.put(p,s1[i]);
            }
        }
        return true;
    }
}
