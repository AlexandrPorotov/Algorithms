package LeetCode;

import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
//all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {

    public static void main(String[] args) {


        ValidPalindrome validPalindrome = new ValidPalindrome();
        String input = "race a car";
        boolean result = validPalindrome.isPalindrome(input);


    }

    public boolean isPalindrome(String s) {

        String reverse = " ";

        s = s.toUpperCase();
        //System.out.println(s);
        char[] chars = s.toCharArray();
        //System.out.println("chars = " + Arrays.toString(chars));
        StringBuilder cleanStr = new StringBuilder();

        for(char ch : chars){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                cleanStr.append(ch);
                //System.out.println(ch);
            }
        }

        s = cleanStr.toString();
        reverse = cleanStr.reverse().toString();

        //System.out.println(s);
        //System.out.println(reverse);

        return s.equalsIgnoreCase(reverse);

    }
}
