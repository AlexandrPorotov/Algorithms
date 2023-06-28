package LeetCode.MediumLevel;

import java.util.Arrays;
import java.util.Stack;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
public class RotateArray {

    public int[] rotate(int[] nums, int k) {


        k %= nums.length;

        int[] leftPart = Arrays.copyOfRange(nums,0,nums.length-k);

        int[] rightPart = Arrays.copyOfRange(nums,nums.length-k,nums.length);

        int[] result = new int[nums.length];

        for(int i = 0; i <= rightPart.length-1; i++){
            result[i] = rightPart[i];
        }

        for(int i = 0; i <= leftPart.length-1; i++){
            result[i+rightPart.length] = leftPart[i];
        }

        return result;

    }

    public int[] rotate1(int[] nums, int k) {

        System.out.println(k);
        k %= nums.length;
        System.out.println(k);

        int[] result = new int[nums.length];

        Stack<Integer> stackRight = new Stack<>();
        Stack<Integer> stackLeft = new Stack<>();


        for(int i = nums.length-1; i >= k; i--){
            stackRight.add(nums[i]);
        }
        for(int i = k; i >= 0; i --){
            stackLeft.add(nums[i]);
        }

        System.out.println(stackRight);
        System.out.println(stackLeft);

        //make result

        System.out.println(Arrays.toString(result));

        return result;

    }

}
