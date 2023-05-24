package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private static SearchInsertPosition searchInsertPosition;

    @BeforeAll
    public static void initMethod(){
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void searchInsert_case_1() {
        //Input: nums = [1,3,5,6], target = 5
        //Output: 2

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int actual = searchInsertPosition.searchInsert(nums,target);
        int expected = 2;

        assertEquals(expected,actual);

    }

    @Test
    void searchInsert_case_2() {
        //Input: nums = [1,3,5,6], target = 2
        //Output: 1

        int[] nums = {1,3,5,6};
        int target = 2;

        int actual = searchInsertPosition.searchInsert(nums,target);
        int expected = 1;

        assertEquals(expected,actual);

    }

    @Test
    void searchInsert_case_3() {
        //Input: nums = [1,3,5,6], target = 7
        //Output: 4

        int[] nums = {1,3,5,6};
        int target = 7;

        int actual = searchInsertPosition.searchInsert(nums,target);
        int expected = 4;

        assertEquals(expected,actual);

    }

    @Test
    void searchInsert_case_4() {
        //Input: nums = [1], target = 2
        //Output: 1

        int[] nums = {1};
        int target = 2;

        int actual = searchInsertPosition.searchInsert(nums,target);
        int expected = 1;

        assertEquals(expected,actual);

    }

}