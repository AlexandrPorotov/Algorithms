package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    private static PowerOfThree powerOfThree;

    @BeforeAll
    public static void initMethod(){
        powerOfThree = new PowerOfThree();
    }

    //Input: n = 27
    //Output: true
    //Explanation: 27 = 33
    @Test
    void isPowerOfThree_case_1() {

        int n = 27;
        boolean expected = true;
        boolean actual = powerOfThree.isPowerOfThree(n);
        assertEquals(expected,actual);

    }

    //Input: n = 0
    //Output: false
    //Explanation: There is no x where 3x = 0.
    @Test
    void isPowerOfThree_case_2() {

        int n = 0;
        boolean expected = false;
        boolean actual = powerOfThree.isPowerOfThree(n);
        assertEquals(expected,actual);

    }

    //Input: n = -1
    //Output: false
    //Explanation: There is no x where 3x = (-1).
    @Test
    void isPowerOfThree_case_3() {

        int n = -1;
        boolean expected = false;
        boolean actual = powerOfThree.isPowerOfThree(n);
        assertEquals(expected,actual);

    }
}