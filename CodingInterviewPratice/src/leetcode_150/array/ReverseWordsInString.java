package leetcode_150.array;

import java.util.ArrayList;
import java.util.Collection;

/*
Input: s = "a good   example"
Output: "example good a"

1. split logic
    - loop through array of character
    - if s == ' '
        add word to arraylist
       else
        append string
2. reverse word

 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String result = "";
        String word = "";
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && !word.isBlank()){
                wordList.add(word);
                word = "";
            }else{
                word += s.charAt(i);
            }
        }
        if(s.charAt(s.length()-1)!= ' ' && !word.isBlank()){
            wordList.add(word);
        }
        System.out.println(wordList);
        for (int i = wordList.size()-1; i >= 0 ; i--){
            result += i != 0 ? wordList.get(i)+" " : wordList.get(i);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        reverseWords("a good   example");
    }
}
