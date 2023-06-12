package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= nums.length <= 104
//-104 < nums[i], target < 104
//All the integers in nums are unique.
//nums is sorted in ascending order.
class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    public static void initMethod(){
        binarySearch = new BinarySearch();
    }

    //Input: nums = [-1,0,3,5,9,12], target = 9
    //Output: 4
    //Explanation: 9 exists in nums and its index is 4
    @Test
    void search_case_1() {

        int[] inputNums = {-1,0,3,5,9,12};
        int target = 9;
        int expected = 4;

        int actual = binarySearch.search(inputNums,target);

        assertEquals(expected,actual);

    }


    //Input: nums = [-1,0,3,5,9,12], target = 2
    //Output: -1
    //Explanation: 2 does not exist in nums so return -1
    @Test
    void search_case_2() {

        int[] inputNums = {-1,0,3,5,9,12};
        int target = 2;
        int expected = -1;

        int actual = binarySearch.search(inputNums,target);

        assertEquals(expected,actual);

    }
}