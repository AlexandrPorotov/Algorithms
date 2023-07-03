package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Constraints:
//
//1 <= n <= 45
class ClimbingStairsTest {

    private static ClimbingStairs climbingStairs;

    @BeforeAll
    public static void initMehod(){
        climbingStairs = new ClimbingStairs();
    }

    //Input: n = 2
    //Output: 2
    //Explanation: There are two ways to climb to the top.
    //1. 1 step + 1 step
    //2. 2 steps
    @Test
    void climbStairs_case_1() {
        int input = 2;
        int expected = 2;
        int actual = climbingStairs.climbStairs(input);
        assertEquals(expected,actual);
    }

    //Input: n = 3
    //Output: 3
    //Explanation: There are three ways to climb to the top.
    //1. 1 step + 1 step + 1 step
    //2. 1 step + 2 steps
    //3. 2 steps + 1 step
    @Test
    void climbStairs_case_2() {
        int input = 3;
        int expected = 3;
        int actual = climbingStairs.climbStairs(input);
        assertEquals(expected,actual);
    }
}