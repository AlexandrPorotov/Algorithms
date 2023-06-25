package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= s.length <= 1000
//s consists of English letters (lower-case and upper-case), ',' and '.'.
//1 <= numRows <= 1000
class ZigzagConversionTest {

    private static ZigzagConversion zigzagConversion;

    @BeforeAll
    public static void initMethod(){
        zigzagConversion = new ZigzagConversion();
    }

    //Input: s = "PAYPALISHIRING", numRows = 3
    //Output: "PAHNAPLSIIGYIR"
    @Test
    void convert_case_1() {

        String input = "PAYPALISHIRING";
        int numRows = 3;

        String expected = "PAHNAPLSIIGYIR";
        String actual = zigzagConversion.convert(input,numRows);

        assertEquals(expected,actual);
    }

    //Input: s = "PAYPALISHIRING", numRows = 4
    //Output: "PINALSIGYAHRPI"
    //Explanation:
    //P     I    N
    //A   L S  I G
    //Y A   H R
    //P     I
    @Test
    void convert_case_2() {

        String input = "PAYPALISHIRING";
        int numRows = 4;

        String expected = "PINALSIGYAHRPI";
        String actual = zigzagConversion.convert(input,numRows);

        assertEquals(expected,actual);
    }

    //Input: s = "A", numRows = 1
    //Output: "A"
    @Test
    void convert_case_3() {

        String input = "A";
        int numRows = 1;

        String expected = "A";
        String actual = zigzagConversion.convert(input,numRows);

        assertEquals(expected,actual);
    }
}