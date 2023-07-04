package LeetCode.EasyLevel;

//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.
//https://leetcode.com/problems/isomorphic-strings/

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
//        countLetters("foo");
//        countLetters("bar");
//        countLetters("egg");
//        countLetters("add");
//        countLetters("paper");
//        countLetters("title");
    }

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapT = new HashMap<>();
        Map<Character, Character> mapS = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            mapS.put(sArr[i], tArr[i]);
            mapT.put(tArr[i], sArr[i]);
        }
//        System.out.println(s);
//        System.out.println(mapS);
//        System.out.println(t);
//        System.out.println(mapT);

        StringBuilder buildS = new StringBuilder();
        StringBuilder buildT = new StringBuilder();

        for(char ch : sArr){
            buildT.append(mapS.get(ch));
        }
        for(char ch : tArr){
            buildS.append(mapT.get(ch));
        }


        return s.contentEquals(buildS) && t.contentEquals(buildT);
    }

//    public static Map<Character,Integer> countLetters(String inputString){
//        Map<Character,Integer> map = new HashMap<>();
//        for(char ch : inputString.toCharArray()){
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            } else {
//                map.replace(ch,map.get(ch),map.get(ch) + 1);
//            }
//        }
//        //System.out.println(map);
//        return map;
//    }

}
