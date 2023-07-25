package LeetCode.MediumLevel;

//Given a string s, return the longest palindromic substring in s.
//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int left = 0;

        for(int right = 1; right < s.length(); right++){
            if(s.charAt(left) == s.charAt(right)){
                System.out.println(s.substring(left,right));
                left = right;
                right++;
            }
        }

        return "";
    }

}
