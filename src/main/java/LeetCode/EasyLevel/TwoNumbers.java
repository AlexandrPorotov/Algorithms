package LeetCode.EasyLevel;

import java.util.*;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.


public class TwoNumbers {

    public static void main(String[] args) {

        //2, 7, 11, 15
        //9
    }

    public int[] twoSum(int[] nums, int target) {

        int[] buff = new int[2];
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            int def = target - nums[i];
            if(myMap.containsKey(def)){
                return new int[]{myMap.get(def), i};
            }
            myMap.put(nums[i],i);
        }
        return buff;
    }

}
