package leetcode_150;

public class Anagrams {

    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        System.out.println("isAnagram: "+isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int[] notesArr = new int[250];
        boolean result = true;
        int i = 0,j = 0;
        while (i < s.length() || j < t.length()){
            if(i < s.length()){
                int sIndex = (int)s.charAt(i);
                notesArr[sIndex] += 1;
                i++;
            }
            if(j < t.length()){
                int tIndex = (int)t.charAt(j);
                notesArr[tIndex] += -1;
                j++;
            }
        }
        for (int k = 0; k < notesArr.length; k++) {
            if(notesArr[k] != 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
