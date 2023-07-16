package LeetCode.MediumLevel;

//1493. Longest Subarray of 1's After Deleting One Element

//Given a binary array nums, you should delete one element from it.
//
//Return the size of the longest non-empty subarray containing
// only 1's in the resulting array. Return 0 if there is no such subarray.

//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
public class LongestSubarray {

    //two pointers
    public int longestSubarray(int[] nums){

        int left = 0;
        int countZeros = 0;
        int result = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){
                countZeros++;
            }

            while (countZeros > 1){
                if(nums[left] == 0){
                    countZeros--;
                }
                left++;
            }

            result = Math.max(result, right-left+1-countZeros);

        }

        return (result == nums.length) ? result-1 : result;
    }

//    public int longestSubarray(int[] nums) {
//
//        int[] prefix = prefixSumArray(nums);
//        if(prefix[prefix.length-1] == nums.length){
//            return nums.length-1;
//        }
//
//        int result = 0;
//
//        int max = 0;
//        int indexMax = 0;
//
//        for(int right = 0; right < nums.length; right++){
//            if(prefix[right] > max){
//                max = prefix[right];
//                indexMax = right;
//            }
//        }
//
//        int countZeros = 0;
//        int leftResult = max;
//        for(int i = indexMax - max; i >= 0; i--){
//            if(prefix[i] == 0 && countZeros == 0){
//                countZeros++;
//            }  else if (prefix[i] != 0 && countZeros == 1) {
//                System.out.println("second zero index LEFT = " + i);
//                leftResult += prefix[i];
//                break;
//            } else {
//                break;
//            }
//        }
//
//        countZeros = 0;
//        int rightResult = max;
//        for(int i = indexMax; i < prefix.length; i++){
//            if (prefix[i] == 0 && countZeros == 0) {
//                countZeros++;
//            } else if (prefix[i] == 0 && countZeros == 1){
//                System.out.println("second zero index RIGHT = " + i);
//                rightResult += prefix[i-1];
//                break;
//            }
//            if (i == prefix.length - 1 && countZeros == 1){
//                rightResult += prefix[i];
//            }
//        }
//
//
//        System.out.println("Maximum in prefix = " + max);
//        System.out.println("Index of max = " + indexMax);
//
//        System.out.println("Left max = " + leftResult);
//        System.out.println("Right max = " + rightResult);
//
//        return Math.max(leftResult,rightResult);
//
//    }
//
//    public static int[] prefixSumArray(int[] array) {
//        int n = array.length;
//        int[] prefixSum = new int[n];
//        prefixSum[0] = array[0];
//
//        for (int i = 1; i < n; i++) {
//            if (array[i] == 0) {
//                prefixSum[i] = 0;
//            } else {
//                prefixSum[i] = prefixSum[i - 1] + 1;
//            }
//        }
//
//        System.out.println("Prefix sum = " + Arrays.toString(prefixSum));
//
//        return prefixSum;
//    }

}
