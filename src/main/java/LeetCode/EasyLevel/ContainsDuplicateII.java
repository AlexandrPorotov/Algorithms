package LeetCode.EasyLevel;


import java.util.HashSet;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that
// nums[i] == nums[j] and abs(i - j) <= k.
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case...
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<>();
        // Traverse for all elements of the given array in a for loop...
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() >= k+1){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }

}
