package leetcode_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> anagramMap= new HashMap<>();
        String str="",key="";
        int[] counts;
        for (int i = 0; i < strs.length; i++) {
            counts= new int[128];
            char[] strChar = strs[i].toCharArray();
            for (int j = 0; j < strChar.length; j++) {
                counts[strChar[j]] += 1;
            }
            key = Arrays.toString(counts);
            if(anagramMap.containsKey(key)){
                anagramMap.get(key).add(strs[i]);
            }else{
                ArrayList strList = new ArrayList<>();
                strList.add(strs[i]);
                anagramMap.put(key,strList);
            }
        }

        return anagramMap.values().stream().toList();
    }
}
