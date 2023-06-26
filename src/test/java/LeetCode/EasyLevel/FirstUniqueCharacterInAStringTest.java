package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//1 <= s.length <= 105
//s consists of only lowercase English letters.
class FirstUniqueCharacterInAStringTest {

    private static FirstUniqueCharacterInAString firstUniqueCharacterInAString;

    @BeforeAll
    public static void initMethod(){
        firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
    }

    //Input: s = "leetcode"
    //Output: 0
    @Test
    void firstUniqChar_case_1() {

        String input = "leetcode";
        int expected = 0;

        int actual = firstUniqueCharacterInAString.firstUniqChar(input);

        assertEquals(expected,actual);
    }

    //Input: s = "loveleetcode"
    //Output: 2
    @Test
    void firstUniqChar_case_2() {

        String input = "loveleetcode";
        int expected = 2;

        int actual = firstUniqueCharacterInAString.firstUniqChar(input);

        assertEquals(expected,actual);
    }

    //Input: s = "aabb"
    //Output: -1
    @Test
    void firstUniqChar_case_3() {

        String input = "aabb";
        int expected = -1;

        int actual = firstUniqueCharacterInAString.firstUniqChar(input);

        assertEquals(expected,actual);
    }
}