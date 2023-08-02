package codeinterview;

import java.util.HashMap;
import java.util.Map;

public class IntToRomanNumber {
    private static Map<Integer,String> romanMapping = new HashMap<>();
    public static String intToRomanNumber(int num){
        String result = "";
        while (num >0 && num<400){
            if(num>=100){
                result = result+(romanMapping.get(100).repeat(num/100));
                num = num%100;
            }else if(num>=10){
                result = result+(romanMapping.get(((num/10)*10)));
                num = num%10;
            }else{
                result = result+(romanMapping.get(num));
                break;
            }
        }
        return result.isBlank() || result.isEmpty()?"INVALID NUMBER":result;
    }

    public static void main(String[] args) {

        romanMapping.put(1,"I");
        romanMapping.put(2,"II");
        romanMapping.put(3,"III");
        romanMapping.put(4,"IV");
        romanMapping.put(5,"V");
        romanMapping.put(6,"VI");
        romanMapping.put(7,"VII");
        romanMapping.put(8,"VIII");
        romanMapping.put(9,"IX");
        romanMapping.put(10,"X");
        romanMapping.put(20,"XX");

        romanMapping.put(30,"XXX");
        romanMapping.put(40,"XL");
        romanMapping.put(50,"L");
        romanMapping.put(60,"LX");
        romanMapping.put(70,"LXX");
        romanMapping.put(80,"LXXX");
        romanMapping.put(90,"XC");
        romanMapping.put(100,"C");
        String result = IntToRomanNumber.intToRomanNumber(169);
        System.out.println(result);
    }
}
