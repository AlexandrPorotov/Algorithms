package LeetCode.EasyLevel;

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        } else if (n == 0){
            return false;
        }

        while (n != 2){
            if(n%2 != 0){
                return false;
            } else {
                n = n/2;
            }
        }

        return true;
    }

}
