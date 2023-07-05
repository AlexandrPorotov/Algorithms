package LeetCode.EasyLevel;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
// non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
