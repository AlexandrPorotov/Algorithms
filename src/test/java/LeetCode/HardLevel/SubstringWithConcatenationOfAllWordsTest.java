package LeetCode.HardLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//1 <= s.length <= 104
//1 <= words.length <= 5000
//1 <= words[i].length <= 30
//s and words[i] consist of lowercase English letters.
class SubstringWithConcatenationOfAllWordsTest {

    private static SubstringWithConcatenationOfAllWords substringWithConcatenationOfAllWords;

    @BeforeAll
    public static void initMethod(){
        substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
    }

    //Input: s = "barfoothefoobarman", words = ["foo","bar"]
    //Output: [0,9]
    //Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
    //The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
    //The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
    //The output order does not matter. Returning [9,0] is fine too.
    @Test
    void findSubstring_case_1() {
        String input = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(9);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
    //Output: []
    //Explanation: Since words.length == 4 and words[i].length == 4, the concatenated substring has to be of length 16.
    //There is no substring of length 16 is s that is equal to the concatenation of any permutation of words.
    //We return an empty array.
    @Test
    void findSubstring_case_2() {
        String input = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        List<Integer> expected = new ArrayList<>();

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
    //Output: [6,9,12]
    //Explanation: Since words.length == 3 and words[i].length == 3, the concatenated substring has to be of length 9.
    //The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"] which is a permutation of words.
    //The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"] which is a permutation of words.
    //The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"] which is a permutation of words.
    @Test
    void findSubstring_case_3() {
        String input = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(9);
        expected.add(12);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "lingmindraboofooowingdingbarrwingmonkeypoundcake" words = ["fooo","barr","wing","ding","wing"]
    //Output: [13]
    @Test
    void findSubstring_case_4() {
        String input = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        List<Integer> expected = new ArrayList<>();
        expected.add(13);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "ababaab" words = ["ab","ba","ba"]
    //Output: [1]
    @Test
    void findSubstring_case_5() {
        String input = "ababaab";
        String[] words = {"ab","ba","ba"};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

}