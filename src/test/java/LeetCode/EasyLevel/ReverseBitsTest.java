package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//The input must be a binary string of length 32
class ReverseBitsTest {

    private static ReverseBits reverseBits;

    @BeforeAll
    public static void initMethod(){
        reverseBits = new ReverseBits();
    }

    //Input: n = 00000010100101000001111010011100
    //Output:    964176192 (00111001011110000010100101000000)
    //Explanation: The input binary string 00000010100101000001111010011100
    // represents the unsigned integer 43261596, so return 964176192 which its
    // binary representation is 00111001011110000010100101000000.
    @Test
    void reverseBits_case_1() {

        String input = "00000010100101000001111010011100";
        String expected = "964176192";
        String actual = String.valueOf(reverseBits.reverseBits(input));
        assertEquals(expected,actual);

    }

    //Input: n = 11111111111111111111111111111101
    //Output:   3221225471 (10111111111111111111111111111111)
    //Explanation: The input binary string 11111111111111111111111111111101 represents
    // the unsigned integer 4294967293, so return 3221225471 which its binary representation
    // is 10111111111111111111111111111111.
    @Test
    void reverseBits_case_2() {

        String input = "11111111111111111111111111111101";
        String expected = "3221225471";
        String actual = String.valueOf(reverseBits.reverseBits(input));
        assertEquals(expected,actual);

    }
}