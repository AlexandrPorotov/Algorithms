package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    private static LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeAll
    public static void initMethod(){
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    @Test
    @DisplayName("Case 1 - babad")
    void longestPalindrome_case_1() {
        String input = "babad";
        System.out.println("Input = " + input);
        String expected = "aba";

        String actual = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expected,actual);
    }

    //Input: s = "cbbd"
    //Output: "bb"
    @Test
    @DisplayName("Case 2 - cbbd")
    void longestPalindrome_case_2() {
        String input = "cbbd";
        System.out.println("Input = " + input);
        String expected = "bb";

        String actual = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expected,actual);
    }

    //Input: s = "ac"
    //Output: "a"
    @Test
    @DisplayName("Case 3 - ac")
    void longestPalindrome_case_3() {
        String input = "ac";
        System.out.println("Input = " + input);
        String expected = "a";

        String actual = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expected,actual);
    }

    //Input: s = "ccc"
    //Output: "ccc"
    @Test
    @DisplayName("Case 4 - ccc")
    void longestPalindrome_case_4() {
        String input = "ccc";
        System.out.println("Input = " + input);
        String expected = "ccc";

        String actual = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expected,actual);
    }

    //Input: s = "aacabdkacaa"
    //Output: "aca"
    @Test
    @DisplayName("Case 5 - aacabdkacaa")
    void longestPalindrome_case_5() {
        String input = "aacabdkacaa";
        System.out.println("Input = " + input);
        String expected = "aca";

        String actual = longestPalindromicSubstring.longestPalindrome(input);

        assertEquals(expected,actual);
    }
}