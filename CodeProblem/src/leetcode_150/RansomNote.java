package leetcode_150;

import java.util.Arrays;

public class RansomNote {

    public static void main(String[] args) {
        int[] notesArr = new int[250];
        String  ransomNote = "fihjjjjei", magazine = "hjibagacbhadfaefdjaeaebgi";
        boolean result = true;
        int i = 0,j = 0;
        while (i < ransomNote.length() || j < magazine.length()){

            if(i < ransomNote.length()){
                int ransomIndex = (int)ransomNote.charAt(i);
                notesArr[ransomIndex] += 1;
                i++;
            }
            if(j < magazine.length()){
                int magazineIndex = (int)magazine.charAt(j);
                notesArr[magazineIndex] += -1;
                j++;
            }
        }
        System.out.println(Arrays.toString(notesArr));
        for (int k = 0; k < notesArr.length; k++) {
            if(notesArr[k]>0){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
