package LeetCode.EasyLevel;

//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array.

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int totalSum = n*(n+1)/2;
        for (int num : nums) {
            totalSum -= num;
        }
        return totalSum;
    }

}
