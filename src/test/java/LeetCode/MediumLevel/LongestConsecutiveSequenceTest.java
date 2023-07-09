package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
class LongestConsecutiveSequenceTest {

    private static LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeAll
    public static void initMethod(){
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    //Input: nums = [100,4,200,1,3,2]
    //Output: 4
    //Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    @Test
    void longestConsecutive_case_1() {

        int[] input = {100,4,200,1,3,2};
        int expected = 4;

        int actual = longestConsecutiveSequence.longestConsecutive(input);

        assertEquals(expected, actual);

    }

    //Input: nums = [0,3,7,2,5,8,4,6,0,1]
    //Output: 9
    @Test
    void longestConsecutive_case_2() {

        int[] input = {0,3,7,2,5,8,4,6,0,1};
        int expected = 9;

        int actual = longestConsecutiveSequence.longestConsecutive(input);

        assertEquals(expected, actual);

    }
}