package LeetCode.MediumLevel;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    //
    //You must write an algorithm that runs in O(n) time.
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int temp = 1;
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == (nums[i + 1] - 1)) {
                temp++;
                count = Math.max(count, temp);
            } else if (nums[i] == (nums[i + 1])) {
                count = Math.max(count, temp);
            } else {
                temp = 1;
                count = Math.max(count, temp);
            }
        }
        return count;
    }

}
