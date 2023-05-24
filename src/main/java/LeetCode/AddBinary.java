package LeetCode;

import java.util.Arrays;

//Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010","1011"));
    }
    public String addBinary(String a, String b) {


        return Long.toBinaryString(binaryToInteger(a)+binaryToInteger(b));

    }

    public long binaryToInteger(String str){

        int[] binaryArray = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

        long result = 0;

        for(int i = binaryArray.length-1, b = 0; i >= 0 && b < binaryArray.length; i--, b++){

            int append = (int) (binaryArray[b] * Math.pow(2,i));
            result = result + append;

        }
        return result;
    }
}
