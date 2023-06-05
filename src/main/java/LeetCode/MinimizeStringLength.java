package LeetCode;


import java.util.Arrays;
import java.util.HashSet;

//Given a 0-indexed string s, repeatedly perform the following operation any number of times:
//
//Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
//Your task is to minimize the length of s by performing the above operation any number of times.
//
//Return an integer denoting the length of the minimized string.
public class MinimizeStringLength {

    public int minimizedStringLength(String s) {

        HashSet<String> set = new HashSet<>(Arrays.asList(s.split("")));

        return set.size();
    }

}
