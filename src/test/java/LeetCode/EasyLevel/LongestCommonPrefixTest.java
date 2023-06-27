package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters.
class LongestCommonPrefixTest {

    private static LongestCommonPrefix longestCommonPrefix;

    @BeforeAll
    public static void initMethod(){
        longestCommonPrefix = new LongestCommonPrefix();
    }

    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    @Test
    void longestCommonPrefix_case_1() {

        String[] input = {"flower","flow","flight"};
        String expected = "fl";

        String actual = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(expected,actual);

    }

    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    @Test
    void longestCommonPrefix_case_2() {

        String[] input = {"dog","racecar","car"};
        String expected = "";

        String actual = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(expected,actual);

    }

    //strs = ["c","acc","ccc"]
    //Output: ""
    @Test
    void longestCommonPrefix_case_3() {

        String[] input = {"c","acc","ccc"};
        String expected = "";

        String actual = longestCommonPrefix.longestCommonPrefix(input);

        assertEquals(expected,actual);

    }
}