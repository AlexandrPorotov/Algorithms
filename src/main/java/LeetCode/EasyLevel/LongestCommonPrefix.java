package LeetCode.EasyLevel;


//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

//https://leetcode.com/problems/longest-common-prefix/


import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];

        char[] f1 = firstWord.toCharArray();
        char[] f2 = lastWord.toCharArray();
        StringBuilder minSubString = new StringBuilder();

        for(int i = 0; i <= Math.max(f1.length -1 , f2.length-1); i++){

            if(i <= f1.length-1 && f2[i] == f1[i]){
                minSubString.append(f2[i]);
            } else {
                break;
            }
        }

        return minSubString.toString();
    }

}
