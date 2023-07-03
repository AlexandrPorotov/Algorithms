package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//nums1.length == m + n
//nums2.length == n
//0 <= m, n <= 200
//1 <= m + n <= 200
//-109 <= nums1[i], nums2[j] <= 109
class MergeSortedArrayTest {

    private static MergeSortedArray mergeSortedArray;

    @BeforeAll
    public static void initMethod(){
        mergeSortedArray = new MergeSortedArray();
    }

    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    //The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    @Test
    void merge_case_1() {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] actual = mergeSortedArray.merge(nums1,m,nums2,n);

        assertArrayEquals(expected,actual);

    }

    //Input: nums1 = [1], m = 1, nums2 = [], n = 0
    //Output: [1]
    //Explanation: The arrays we are merging are [1] and [].
    //The result of the merge is [1].
    @Test
    void merge_case_2() {

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {1};
        int[] actual = mergeSortedArray.merge(nums1,m,nums2,n);

        assertArrayEquals(expected,actual);

    }

    //Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    //Output: [1]
    //Explanation: The arrays we are merging are [] and [1].
    //The result of the merge is [1].
    //Note that because m = 0, there are no elements in nums1.
    // The 0 is only there to ensure the merge result can fit in nums1.
    @Test
    void merge_case_3() {

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] expected = {1};
        int[] actual = mergeSortedArray.merge(nums1,m,nums2,n);

        assertArrayEquals(expected,actual);

    }
}