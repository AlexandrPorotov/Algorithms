package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= s.length <= 100
//s consists only of uppercase English letters.
class MinimumStringLengthAfterRemovingSubstringsTest {


    private static MinimumStringLengthAfterRemovingSubstrings minimumStringLengthAfterRemovingSubstrings;

    @BeforeAll
    public static void initMethod(){
        minimumStringLengthAfterRemovingSubstrings = new MinimumStringLengthAfterRemovingSubstrings();
    }


    //Input: s = "ABFCACDB"
    //Output: 2
    //Explanation: We can do the following operations:
    //- Remove the substring "ABFCACDB", so s = "FCACDB".
    //- Remove the substring "FCACDB", so s = "FCAB".
    //- Remove the substring "FCAB", so s = "FC".
    //So the resulting length of the string is 2.
    //It can be shown that it is the minimum length that we can obtain.
    @Test
    void minLength_case_1() {

        String input = "ABFCACDB";
        int expected = 2;

        int actual = minimumStringLengthAfterRemovingSubstrings.minLength(input);

        assertEquals(expected, actual);
    }


    //Input: s = "ACBBD"
    //Output: 5
    //Explanation: We cannot do any operations on the string so the length remains the same.
    @Test
    void minLength_case_2() {

        String input = "ACBBD";
        int expected = 5;

        int actual = minimumStringLengthAfterRemovingSubstrings.minLength(input);

        assertEquals(expected, actual);
    }


    @Test
    void minLength_case_3() {

        String input = "AB";
        int expected = 0;

        int actual = minimumStringLengthAfterRemovingSubstrings.minLength(input);

        assertEquals(expected, actual);
    }

    @Test
    void minLength_case_4() {

        String input = "ABCD";
        int expected = 0;

        int actual = minimumStringLengthAfterRemovingSubstrings.minLength(input);

        assertEquals(expected, actual);
    }

}