package LeetCode.EasyLevel;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if(nums.length == 0){return false;}

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }

}
