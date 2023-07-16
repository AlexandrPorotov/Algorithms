package LeetCode.EasyLevel;


//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.

//https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

            HashSet<Integer> set1 = new HashSet<Integer>();
            for (Integer n : nums1) set1.add(n);
            HashSet<Integer> set2 = new HashSet<Integer>();
            for (Integer n : nums2) set2.add(n);

            set1.retainAll(set2);

            int [] output = new int[set1.size()];
            int idx = 0;
            for (int s : set1) output[idx++] = s;
            return output;

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        for(int i : nums1){
//            set1.add(i);
//        }
//
//        for(int i : nums2){
//            set2.add(i);
//        }
//
//        int count = 0;
//        List<Integer> buff = new ArrayList<>();
//
//        if(set1.size() > set2.size()){
//            for(Integer i : set2){
//                if(set1.contains(i)){
//                    count++;
//                    buff.add(i);
//                }
//            }
//        } else {
//            for(Integer i : set1){
//                if(set2.contains(i)){
//                    count++;
//                    buff.add(i);
//                }
//            }
//        }
//
//        System.out.println("Count = " + count);
//        System.out.println("Buff = " + buff);
//
//        int[] result = new int[count];
//
//        for(int i = 0; i < result.length; i++){
//            result[i] = buff.get(i);
//        }
//
//        return result;
    }

}
