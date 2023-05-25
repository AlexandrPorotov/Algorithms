package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private static ValidPalindrome validPalindrome;

    @BeforeAll
    public static void initMethod() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void isPalindrome_case_1() {

        //Input: s = "A man, a plan, a canal: Panama"
        //Output: true
        //Explanation: "amanaplanacanalpanama" is a palindrome.

        String input = "A man, a plan, a canal: Panama";
        boolean result = validPalindrome.isPalindrome(input);

        assertTrue(result);

    }

    @Test
    void isPalindrome_case_2() {

        //Input: s = "race a car"
        //Output: false
        //Explanation: "raceacar" is not a palindrome.

        String input = "race a car";
        boolean result = validPalindrome.isPalindrome(input);

        assertFalse(result);

    }

    @Test
    void isPalindrome_case_3() {

        //Input: s = " "
        //Output: true
        //Explanation: s is an empty string "" after removing non-alphanumeric characters.
        //Since an empty string reads the same forward and backward, it is a palindrome.

        String input = " ";
        boolean result = validPalindrome.isPalindrome(input);

        assertTrue(result);

    }


}