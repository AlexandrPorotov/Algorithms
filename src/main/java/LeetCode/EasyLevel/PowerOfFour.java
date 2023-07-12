package LeetCode.EasyLevel;

//Given an integer n, return true if it is a power of four. Otherwise, return false.
//
//An integer n is a power of four, if there exists an integer x such that n == 4x.

//https://leetcode.com/problems/power-of-four/description/
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        } else if (n == 0){
            return false;
        }

        while (n != 4){
            if(n%4 != 0){
                return false;
            } else {
                n = n/4;
            }
        }

        return true;
    }
}
