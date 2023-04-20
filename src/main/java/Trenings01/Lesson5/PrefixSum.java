package Trenings01.Lesson5;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args){

        int result = getPrefix(new int[]{1,2,3,4,5,6,7,8,9,10},5,9);
        System.out.println(result);
    }

    private static int[] makePrefix(int[] nums){

        int[] prefix = new int[nums.length + 1];
        prefix[0] = 0;

        for (int i = 1; i < prefix.length; i++){
            prefix[i] = nums[i-1] + prefix[i-1];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(prefix));

        return prefix;

    }

    private static int getPrefix(int[] nums, int a, int b){
        int[] prefix = makePrefix(nums);
        return prefix[b]-prefix[a];
    }
}
