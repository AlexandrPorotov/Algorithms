package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//0 <= x <= 231 - 1
class SqrtXTest {

    private static SqrtX sqrtX;

    @BeforeAll
    public static void initMethod(){
        sqrtX = new SqrtX();
    }

    //Input: x = 4
    //Output: 2
    //Explanation: The square root of 4 is 2, so we return 2.
    @Test
    void mySqrt_case_1() {
        int x = 4;
        int expected = 2;

        int actual = sqrtX.mySqrt(x);

        assertEquals(expected, actual);
    }

    //Input: x = 8
    //Output: 2
    //Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
    @Test
    void mySqrt_case_2() {
        int x = 8;
        int expected = 2;

        int actual = sqrtX.mySqrt(x);

        assertEquals(expected, actual);
    }
}