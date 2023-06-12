package LeetCode;


import java.util.Arrays;

//Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
public class BinarySearch {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left <= right){

            int middle = (left + right) / 2;

            if(target == nums[middle]){
                result = middle;
                break;
            } else if (nums[middle] > target){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            result = -1;
        }

        return result;
    }

//        public int search(int[] nums, int target){
//
//            int result = Arrays.binarySearch(nums,target);
//
//            if(result < 0){
//                result = -1;
//            }
//
//            return result;
//        }

}
