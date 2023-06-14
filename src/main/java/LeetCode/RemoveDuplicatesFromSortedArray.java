package LeetCode;

import java.util.HashSet;
import java.util.Set;


//Poor explanation of conditions
// Disgusting examples
// Disgusting task
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(Integer i : nums){
            set.add(i);
        }

        return set.size() + 1;

    }


}
