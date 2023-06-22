package LeetCode.EasyLevel;

import LeetCode.EasyLevel.PalindromeNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    @DisplayName("x=121; true")
    void isPalindrome_1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(121);
        assertTrue(actual);
    }

    @Test
    @DisplayName("x=-121; false")
    void isPalindrome_2(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(-121);
        assertFalse(actual);
    }

    @Test
    @DisplayName("x=10; false")
    void isPalindrome_3(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(10);
        assertFalse(actual);
    }
}