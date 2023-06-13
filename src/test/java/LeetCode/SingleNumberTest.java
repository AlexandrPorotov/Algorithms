package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//1 <= nums.length <= 3 * 104
//-3 * 104 <= nums[i] <= 3 * 104
//Each element in the array appears twice except for one element which appears only once.

class SingleNumberTest {

    private static SingleNumber singleNumber;

    @BeforeAll
    public static void initMethod(){
        singleNumber = new SingleNumber();
    }


    //Input: nums = [2,2,1]
    //Output: 1
    @Test
    void singleNumber_case_1() {

        int[] inputNums = {2,2,1};
        int expected = 1;

        int actual = singleNumber.singleNumber(inputNums);

        assertEquals(expected,actual);

    }


    //Input: nums = [4,1,2,1,2]
    //Output: 4
    @Test
    void singleNumber_case_2() {

        int[] inputNums = {4,1,2,1,2};
        int expected = 4;

        int actual = singleNumber.singleNumber(inputNums);

        assertEquals(expected,actual);

    }

    //Input: nums = [1]
    //Output: 1
    @Test
    void singleNumber_case_3() {

        int[] inputNums = {1};
        int expected = 1;

        int actual = singleNumber.singleNumber(inputNums);

        assertEquals(expected,actual);

    }

}