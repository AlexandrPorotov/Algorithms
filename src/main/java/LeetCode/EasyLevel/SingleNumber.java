package LeetCode.EasyLevel;


//Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

import java.util.*;

public class SingleNumber {

//    public int singleNumber(int[] nums) {
//
//        Set<Integer> set = new HashSet<>();
//
//        for(Integer i : nums){
//            if(!set.contains(i)){
//                set.add(i);
//            } else {
//                set.remove(i);
//            }
//        }
//
//        return  set.toArray(new Integer[1])[0];
//    }

    public int singleNumber(int[] nums) {
        int result=0;

        for (int num : nums) {
            System.out.print(result + " ^ " + num + " = ");
            result = result ^ num;
            System.out.print(result);
            System.out.println(" ");
        }

        return result;
    }

}
