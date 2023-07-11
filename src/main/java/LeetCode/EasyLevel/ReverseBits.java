package LeetCode.EasyLevel;

//Reverse bits of a given 32 bits unsigned integer.
//https://leetcode.com/problems/reverse-bits/

import java.util.Arrays;

public class ReverseBits {
    // you need treat n as an unsigned value
    public long reverseBits(String str) {

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        str = builder.toString();
        int[] binaryArray = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

        long result = 0;

        for(int i = binaryArray.length-1, b = 0; i >= 0 && b < binaryArray.length; i--, b++){

            int append = (int) (binaryArray[b] * Math.pow(2,i));
            result = result + append;

        }
        return result;

    }

    public int reverseBits(int n) {

        return Integer.reverse(n);

    }
}
