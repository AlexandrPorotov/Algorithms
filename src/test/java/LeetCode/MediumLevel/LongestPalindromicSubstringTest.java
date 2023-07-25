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
        String expected = "bab";

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
}