package LeetCode.HardLevel;
import java.util.*;

//You are given a string s and an array of strings words. All the strings of words are of the same length.
//
//A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
//
//For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab"
// are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation
// of any permutation of words.
//Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.


//https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/

//171 / 178 testcases passed
public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        Map<Integer, String > map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int length = words[0].length();
        int allLength = words.length * length;
        //System.out.println("Length of one word  = " + length);
        //System.out.println("Length of all words = " + allLength);

        for(String word : words){
            map.putIfAbsent(map.size() + 1,word);
        }


        //System.out.println("map = " + map);
        //System.out.println("string = " + s);

        int left = 0;
        for(int right = allLength; right <= s.length(); right+=length){
            String subString = s.substring(left,right);
            //System.out.println("sub string = " + subString + "; left = " + left);

            for(Integer i : map.keySet()){
                subString = removeFirstOccurrence(subString,map.get(i));
                //System.out.println("rep i - " + i + " = " + subString);
            }

            //System.out.println("sub string after replace = " + subString);
            if(subString.length() == 0){
                result.add(left);
            }

            left++;
        }

        //System.out.println(result);

        return result;
    }

    public static String removeFirstOccurrence(String input, String subString) {

        int length = subString.length();
        StringBuilder builder = new StringBuilder();

        int left = 0;
        for(int right = length; right <= input.length(); right += length){
            String subStr = input.substring(left,right);
            if(subStr.equals(subString)){
                return input.substring(0,left) + input.substring(right);
            }
            left += length;
        }

        return input;
    }

}
