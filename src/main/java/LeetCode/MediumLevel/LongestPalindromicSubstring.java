package LeetCode.MediumLevel;

import java.util.HashMap;
import java.util.Map;

//Given a string s, return the longest palindromic substring in s.
//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();
        char[] letters = s.toCharArray();
        String result = "";
        int left;

        for(int right = 0; right < s.length(); right++){
            if(map.containsKey(letters[right])){
                left = map.get(letters[right]);
                System.out.println(left);
                System.out.println(right);
                System.out.println(s.substring(left,right+1));
                result = s.substring(left,right+1);
            } else {
                map.put(letters[right],right);
            }
        }
        System.out.println(map);
        if (map.size() == letters.length){
            result = s.substring(0,1);
        } else if(map.size() == 1){
            result = s;
        }


        return result;
    }

}
