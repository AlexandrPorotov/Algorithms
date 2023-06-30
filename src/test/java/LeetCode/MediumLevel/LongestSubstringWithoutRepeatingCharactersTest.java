package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.
class LongestSubstringWithoutRepeatingCharactersTest {

    private static LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeAll
    public static void initMethod(){
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.
    @Test
    void solution_case_1() {

        String s = "abcabcbb";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = "bbbbb"
    //Output: 1
    //Explanation: The answer is "b", with the length of 1.
    @Test
    void solution_case_2() {

        String s = "bbbbb";
        int expected = 1;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = "pwwkew"
    //Output: 3
    //Explanation: The answer is "wke", with the length of 3.
    //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    @Test
    void solution_case_3() {

        String s = "pwwkew";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = " "
    //Output: 1
    @Test
    void solution_case_4() {

        String s = " ";
        int expected = 1;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = "au"
    //Output: 2
    @Test
    void solution_case_5() {

        String s = "au";
        int expected = 2;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = "aab"
    //Output: 2
    @Test
    void solution_case_6() {

        String s = "aab";
        int expected = 2;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }

    //Input: s = "dvdf"
    //Output: 3
    @Test
    void solution_case_7() {

        String s = "dvdf";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.solution(s);

        assertEquals(expected,actual);

    }
}