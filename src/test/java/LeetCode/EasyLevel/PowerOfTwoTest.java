package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//-231 <= n <= 231 - 1
class PowerOfTwoTest {

    private static PowerOfTwo powerOfTwo;

    @BeforeAll
    public static void initMethod(){
        powerOfTwo = new PowerOfTwo();
    }

    //Input: n = 1
    //Output: true
    //Explanation: 20 = 1
    @Test
    void isPowerOfTwo_case_1() {

        int n = 1;
        boolean expected = true;
        boolean actual = powerOfTwo.isPowerOfTwo(n);
        assertEquals(expected,actual);

    }

    //Input: n = 16
    //Output: true
    //Explanation: 24 = 16
    @Test
    void isPowerOfTwo_case_2() {

        int n = 16;
        boolean expected = true;
        boolean actual = powerOfTwo.isPowerOfTwo(n);
        assertEquals(expected,actual);

    }

    //Input: n = 3
    //Output: false
    @Test
    void isPowerOfTwo_case_3() {

        int n = 3;
        boolean expected = false;
        boolean actual = powerOfTwo.isPowerOfTwo(n);
        assertEquals(expected,actual);

    }


}