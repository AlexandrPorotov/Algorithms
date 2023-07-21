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

    public List<Integer> findSubstring(String s, String[] words){

        int wordLength = words[0].length();
        int totalWordsLength = wordLength * words.length;
        Map<String, Integer> hash = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        char[] s2 = s.toCharArray();
        for (String value : words) {
            hash.putIfAbsent(value, hash.size());
        }
        int[] count = new int[hash.size()];
        for (String word : words) {
            count[hash.get(word)]++;
        }

        System.out.println("Hash = " + hash);
        System.out.println("Count = " + Arrays.toString(count));


        for (int i = 0; i < wordLength; i++) {

            for (int j = i; j <= s.length() - totalWordsLength; j += wordLength) {

                int[] localCount = new int[hash.size()];
                for (int k = j + totalWordsLength - wordLength; k >= j; k -= wordLength) {

                    String str = new String(s2, k, wordLength);     // [ k, k+wordLength )
                    Integer key = hash.get(str);

                    if (!(key != null && count[key] >= ++localCount[key])) {
                        j = k;
                        break;
                    }
                    if (j == k) {
                        ans.add(j);
                    }
                }
            }
        }
        return ans;

    }

    public List<Integer> findSubstringSolution(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        int length = words[0].length();
        int allLength = length * words.length;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> buff = new HashMap<>();
        Map<String, Integer> sample = new HashMap<>();
        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
                buff.put(word, buff.get(word)+1);
            } else {
                map.put(word, 1);
                buff.put(word, 1);
            }
            sample.put(word,0);
        }


        System.out.println(map);

        int left = 0;
        for(int right = allLength; right <= s.length(); right++){

            String subString = s.substring(left,right);
            if(map.containsKey(subString.substring(0,length))) {
                System.out.println("sub string = " + subString);
                int count = 0;
                while (count != subString.length()){
                    String substring = subString.substring(count, count + length);
                    System.out.println(substring);
                    if(map.containsKey(substring)){
                        map.put(substring, map.get(substring)-1);
                    }
                    count += length;
                }
                System.out.println(map);
                if(map.equals(sample)){
                    result.add(left);
                }
                map.putAll(buff);
                System.out.println(buff);
            }
            left++;

        }
        return result;
    }

    public List<Integer> findSubstring2(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        int length = words[0].length();
        int allLength = words.length * length;
        Map<String , Integer > map = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();
        for(String str : words){
            stringBuilder.append(str);
            map.putIfAbsent(str,map.size() + 1);
        }
        String wordSample = stringBuilder.toString();

        char[] arr = wordSample.toCharArray();
        Arrays.sort(arr);
        wordSample = new String(arr);



//        List<String> wordsList = new ArrayList<>(Arrays.asList(words));

        int left = 0;
//        List<String> buffList = new ArrayList<>();

        for(int right = allLength; right <= s.length(); right++){

            if(map.containsKey(s.substring(left, left+length))) {
                String subString = s.substring(left, right);
                System.out.println("sub string = " + subString);
//            int count = 0;
//            while (count != subString.length()){
//                String substring = subString.substring(count, count + length);
//                buffList.add(substring);
//                System.out.println(buffList);
//                count += length;
//            }
                
                char[] locArr = subString.toCharArray();
                Arrays.sort(locArr);
                String sortSubString = new String(locArr);
                System.out.println("sort sub string = " + sortSubString);
                System.out.println("sort word sample = " + wordSample);
                System.out.println("compare = " + sortSubString.compareTo(wordSample));

                System.out.println("Left = " + left);
                if (sortSubString.compareTo(wordSample) == 0) {
                    //дополнительная проверка
                    result.add(left);
                }
            }
//            if(new HashSet<>(wordsList).contains(buffList)){
//                System.out.println("Add result = " + left);
//                result.add(left);
//            }
//            buffList.clear();
            left++;
        }


        return result;
    }
    public List<Integer> findSubstring1(String s, String[] words) {

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



            if(map.containsKey(s.substring(left,right))){
                if(!seen.add(map.get(s.substring(left,right)))) {
                    seen.clear();
                    seen.add(map.get(s.substring(left,right)));
                    System.out.println("next word");
                    System.out.println(s.substring(left,right));
                    System.out.println(seen);
                    tmpLeft = left;
                } else {
                    seen.add(map.get(s.substring(left,right)));
                    if(seen.size() == 1){
                        tmpLeft = left;
                    }
                    System.out.println("add word");
                    System.out.println(s.substring(left,right));
                    System.out.println("seen" + seen);
                }
            }
            if(seen.containsAll(map.values())) {
                System.out.println(s.substring(tmpLeft, right));
                result.add(tmpLeft);
                seen.clear();
                left = tmpLeft;
                right = tmpLeft + length;
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
