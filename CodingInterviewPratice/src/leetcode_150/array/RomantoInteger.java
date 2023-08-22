package leetcode_150.array;


//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000


import java.util.HashMap;
import java.util.Map;

/*

1. loop through each character
2. check curr + next character in the map
    if yes, add to sum
    if no, search for current character in map and add to sum



 */
public class RomantoInteger {


    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            if(i+1 < s.length() && (map.get(s.charAt(i)+"") < map.get(s.charAt(i+1)+""))){
                sum -= map.get(s.charAt(i)+"");
            }else{
                sum += map.get(s.charAt(i)+"");
            }
            System.out.println(s.charAt(i)+" "+sum);
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("CMXCVIII"));
    }
}
