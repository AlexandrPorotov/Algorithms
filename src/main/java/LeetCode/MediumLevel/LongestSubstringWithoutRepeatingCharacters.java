package LeetCode.MediumLevel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Given a string s, find the length of the longest
//substring
// without repeating characters.
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    public int solution1(String s){

        if(s.length() == 1){
            return 1;
        }

        HashMap<Integer,String > map = new HashMap<>();
        char[] letters = s.toCharArray();
        Set<Character> buff = new HashSet<>();

        int index = 0;

        for(int i = 0; i < letters.length; i++){

            if(!buff.contains(letters[i])){
                buff.add(letters[i]);
                System.out.println("add to buff " + buff);
            } else {
                StringBuilder builder = new StringBuilder();
                for(char ch : buff){
                    builder.append(ch);
                }
                String subString = builder.toString();
                System.out.println("add to map " + subString);
                map.put(index, subString);
                index++;
                buff.clear();
                buff.add(letters[i]);
            }

            if(i == letters.length-1 && !buff.isEmpty()){
                StringBuilder builder = new StringBuilder();
                for(char ch : buff){
                    builder.append(ch);
                }
                String subString = builder.toString();
                System.out.println("add to map " + subString);
                map.put(index, subString);
            }

        }

        if(map.size() == 0){
            return s.length();
        }

        System.out.println("result map " + map);

        int maxLength = 0;
        for(int i = 0; i <= map.size()-1; i++){
            if(map.get(i).length() > maxLength){
                maxLength = map.get(i).length();
            }
        }

        return maxLength;
    }

    public int solution(String s){

        int length = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int leftIndex = 0;

        for(int right = 0; right < length; right++){

            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - leftIndex +1);
            } else {
                while (charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(leftIndex));
                    leftIndex++;
                }
                charSet.add(s.charAt(right));
            }

        }

        //System.out.println(charSet);

        return maxLength;
    }


}
