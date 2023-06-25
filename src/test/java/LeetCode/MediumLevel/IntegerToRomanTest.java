package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= num <= 3999
class IntegerToRomanTest {

    private static IntegerToRoman integerToRoman;

    @BeforeAll
    public static void initMethod(){
        integerToRoman = new IntegerToRoman();
    }

    //Input: num = 3
    //Output: "III"
    //Explanation: 3 is represented as 3 ones.
    @Test
    void intToRoman_case_1() {

        int num = 3;
        String expected = "III";

        String actual = integerToRoman.intToRoman(num);

        assertEquals(expected,actual);

    }

    //Input: num = 58
    //Output: "LVIII"
    //Explanation: L = 50, V = 5, III = 3.
    @Test
    void intToRoman_case_2() {

        int num = 58;
        String expected = "LVIII";

        String actual = integerToRoman.intToRoman(num);

        assertEquals(expected,actual);

    }

    //Input: num = 1994
    //Output: "MCMXCIV"
    //Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    @Test
    void intToRoman_case_3() {

        int num = 1994;
        String expected = "MCMXCIV";

        String actual = integerToRoman.intToRoman(num);

        assertEquals(expected,actual);

    }

    @Test
    void intToRoman_case_4() {

        int num = 20;
        String expected = "XX";

        String actual = integerToRoman.intToRoman(num);

        assertEquals(expected,actual);

    }
}