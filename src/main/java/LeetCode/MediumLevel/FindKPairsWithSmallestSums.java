package LeetCode.MediumLevel;


//You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
//
//Define a pair (u, v) which consists of one element from the first array and one element from the second array.
//
//Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/

//not released
public class FindKPairsWithSmallestSums {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

        if(k > nums1.length * nums2.length){return null;}

        int maxSum = nums1[nums1.length-1] + nums2[nums2.length-1];
        System.out.println("Max sum of elements of nums1 and nums2 = " + maxSum);

        Stack<Integer> stack = new Stack<>();
        int minValueForElement = 0;

        int count = 0;

        for(int i = 0; i <= nums1.length-1; i++){
            for(int j = 0; j <= nums2.length-1; j++){
                if(count != k){
                    minValueForElement = nums1[i] + nums2[j];
                    if(nums1[i] + nums2[j] < maxSum) {
                        List<Integer> pair = new ArrayList<>();
                        pair.add(nums1[i]);
                        pair.add(nums2[j]);
                        System.out.println("Pair " + i + " = " + pair);
                        result.add(pair);
                    }
                }
            }
        }

        return result;
    }

}
