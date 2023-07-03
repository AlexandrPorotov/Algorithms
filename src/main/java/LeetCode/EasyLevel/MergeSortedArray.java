package LeetCode.EasyLevel;

import java.util.Arrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
// representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
// be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums2.length == 0) {
            return nums1;
        } else if (nums1.length - m >= n){
            System.arraycopy(nums2, 0, nums1, m, nums2.length);
        } else {
            System.arraycopy(nums2,0,nums1,m,nums1.length-m);
        }
        Arrays.sort(nums1);
        return nums1;

    }

    public void margeTwo(int[] nums1, int m, int[] nums2, int n){
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
    }

}
