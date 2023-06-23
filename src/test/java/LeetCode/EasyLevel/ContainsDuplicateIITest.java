package LeetCode.EasyLevel;

import LeetCode.EasyLevel.ContainsDuplicateII;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109
//0 <= k <= 105
class ContainsDuplicateIITest {

    private static ContainsDuplicateII containsDuplicateII;

    @BeforeAll
    public static void initMethod(){
        containsDuplicateII = new ContainsDuplicateII();
    }

    //Input: nums = [1,2,3,1], k = 3
    //Output: true
    @Test
    void containsNearbyDuplicate_case_1() {

        int[] input = {1,2,3,1};
        int k = 3;
        boolean expected = true;

        boolean actual = containsDuplicateII.containsNearbyDuplicate(input, k);

        assertEquals(expected, actual);

    }

    //Input: nums = [1,0,1,1], k = 1
    //Output: true
    @Test
    void containsNearbyDuplicate_case_2() {

        int[] input = {1,0,1,1};
        int k = 1;
        boolean expected = true;

        boolean actual = containsDuplicateII.containsNearbyDuplicate(input, k);

        assertEquals(expected, actual);

    }

    //Input: nums = [1,2,3,1,2,3], k = 2
    //Output: false
    @Test
    void containsNearbyDuplicate_case_3() {

        int[] input = {1,2,3,1,2,3};
        int k = 2;
        boolean expected = false;

        boolean actual = containsDuplicateII.containsNearbyDuplicate(input, k);

        assertEquals(expected, actual);

    }
}