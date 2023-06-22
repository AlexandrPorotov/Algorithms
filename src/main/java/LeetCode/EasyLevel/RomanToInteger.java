package LeetCode.EasyLevel;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("III"));


    }

    public int romanToInt(String s) {

        HashMap<String,Integer>  map = new HashMap<>();
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

        int result = 0;

        String[] str = s.split("");

        for(int i = 0; i < s.length(); i++){
            if(i != s.length()-1){
                String num = str[i] + str[i+1];
                if(map.containsKey(num)){
                    result = result + map.get(num);
                    i++;
                } else {
                    result = result + map.get(str[i]);
                }
            } else {
                result = result + map.get(str[i]);
            }
        }

        return result;

    }
}
