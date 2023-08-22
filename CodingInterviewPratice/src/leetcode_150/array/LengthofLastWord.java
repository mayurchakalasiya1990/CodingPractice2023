package leetcode_150.array;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int result = 0;
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                result = count > 0 ? count : result;
                count =0;
            }else{
                count++;
            }
        }
        if(s.charAt(s.length()-1) != ' '){
            result = count;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
