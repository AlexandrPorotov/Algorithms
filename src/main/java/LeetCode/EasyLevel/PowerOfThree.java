package LeetCode.EasyLevel;

//Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//An integer n is a power of three, if there exists an integer x such that n == 3x.
//https://leetcode.com/problems/power-of-three/description/
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        } else if (n == 0){
            return false;
        }

        while (n != 3){
            if(n%3 != 0){
                return false;
            } else {
                n = n/3;
            }
        }

        return true;
    }
}
