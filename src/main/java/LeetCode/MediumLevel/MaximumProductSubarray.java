package LeetCode.MediumLevel;

//Given an integer array nums, find a
//subarray
// that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-subarray/
public class MaximumProductSubarray {

    public int maxProductVersionOne(int[] nums) {

        int n = nums.length;
        int[] prefixProduct = new int[n];
        prefixProduct[0] = nums[0];

        //prefixProduct[i-1] <= 0 && nums[i] >= 0 - works

        for (int i = 1; i < n; i++) {
            if (prefixProduct[i - 1] > prefixProduct[i - 1] * nums[i] || prefixProduct[i-1] == 0 ) {
                prefixProduct[i] = nums[i];
            } else {
                prefixProduct[i] = prefixProduct[i - 1] * nums[i];
            }
        }

        System.out.println("Prefix = " + Arrays.toString(prefixProduct));

        return Arrays.stream(prefixProduct).max().getAsInt();
    }

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        System.out.println("Nums[0] = "+nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}
