package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= nums.length <= 105
//-231 <= nums[i] <= 231 - 1
//0 <= k <= 105
class RotateArrayTest {

    private static RotateArray rotateArray;

    @BeforeAll
    public static void initMethod(){
        rotateArray = new RotateArray();
    }

    //Example 1:
    //
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    //Explanation:
    //rotate 1 steps to the right: [7,1,2,3,4,5,6]
    //rotate 2 steps to the right: [6,7,1,2,3,4,5]
    //rotate 3 steps to the right: [5,6,7,1,2,3,4]
    @Test
    void rotate_case_1() {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};

        int[] actual = rotateArray.rotate(nums,k);

        assertArrayEquals(expected, actual);
    }

    //Example 2:
    //
    //Input: nums = [-1,-100,3,99], k = 2
    //Output: [3,99,-1,-100]
    //Explanation:
    //rotate 1 steps to the right: [99,-1,-100,3]
    //rotate 2 steps to the right: [3,99,-1,-100]
    @Test
    void rotate_case_2() {

        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};

        int[] actual = rotateArray.rotate(nums,k);

        assertArrayEquals(expected, actual);
    }
}