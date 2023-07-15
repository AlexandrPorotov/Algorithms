package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayTest {

    private static LongestSubarray longestSubarray;

    @BeforeAll
    public static void initMethod(){
        longestSubarray = new LongestSubarray();
    }

    //Input: nums = [1,1,0,1]
    //Output: 3
    //Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
    @Test
    void longestSubarray_case_1() {

        int[] input = {1,1,0,1};
        int expected = 3;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [0,1,1,1,0,1,1,0,1]
    //Output: 5
    //Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1]
    //longest subarray with value of 1's is [1,1,1,1,1].
    @Test
    void longestSubarray_case_2() {

        int[] input = {0,1,1,1,0,1,1,0,1};
        int expected = 5;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [1,1,1]
    //Output: 2
    //Explanation: You must delete one element.
    @Test
    void longestSubarray_case_3() {

        int[] input = {1,1,1};
        int expected = 2;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [1,0,0,0,1,1,0,1,1,0,0,1,1]
    //Output: 2
    @Test
    void longestSubarray_case_4() {

        int[] input = {1,0,0,0,1,1,0,1,1,0,0,1,1};
        int expected = 4;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [1,1,0,0,1,1,1,0,1]
    //Output: 4
    @Test
    void longestSubarray_case_5() {

        int[] input = {1,1,0,0,1,1,1,0,1};
        int expected = 4;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1]
    //Output: 18
    @Test
    void longestSubarray_case_6() {

        int[] input = {1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1};
        int expected = 18;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

    //Input: nums = [1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,0,1,1,1,1]
    //Output: 14
    @Test
    void longestSubarray_case_7() {

        int[] input = {1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,0,1,1,1,1};
        int expected = 14;
        System.out.println("Input = " + Arrays.toString(input));

        int actual = longestSubarray.longestSubarray(input);

        assertEquals(expected,actual);

    }

}