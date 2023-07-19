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

        Map<String , Integer > map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int length = words[0].length();
        int allLength = words.length * length;
        System.out.println("Length of one word  = " + length);
        System.out.println("Length of all words = " + allLength);

        for(String word : words){
            map.putIfAbsent(word,map.size() + 1);
        }


        System.out.println("map = " + map);
        System.out.println("string = " + s);

        Set<Integer> seen = new HashSet<>();
        int tmpLeft = 0;
        int left = 0;
        for(int right = length; right <= s.length(); right+=length){


            //разобраться с границами и как хранить находить повторяющиеся слова (тк ща у меня в ключе слова в мапе
            if(map.containsKey(s.substring(left,right)) && !seen.containsAll(map.values())){
                seen.add(map.get(s.substring(left,right)));
            }else if(seen.containsAll(map.values())) {
                System.out.println(s.substring(left, right));
                result.add(left - allLength);
                seen.clear();
            }
            left +=length;
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
