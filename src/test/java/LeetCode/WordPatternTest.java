package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= pattern.length <= 300
//pattern contains only lower-case English letters.
//1 <= s.length <= 3000
//s contains only lowercase English letters and spaces ' '.
//s does not contain any leading or trailing spaces.
//All the words in s are separated by a single space.
class WordPatternTest {

    private static WordPattern wordPattern;

    @BeforeAll
    public static void initMethod(){
        wordPattern = new WordPattern();
    }

    //Input: pattern = "abba", s = "dog cat cat dog"
    //Output: true
    @Test
    void wordPattern_case_1() {

        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean excepted = true;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);

    }

    //Input: pattern = "abba", s = "dog cat cat fish"
    //Output: false
    @Test
    void wordPattern_case_2() {

        String pattern = "abba";
        String s = "dog cat cat fish";

        boolean excepted = false;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);

    }

    //Input: pattern = "aaaa", s = "dog cat cat dog"
    //Output: false
    @Test
    void wordPattern_case_3() {

        String pattern = "aaaa";
        String s = "dog cat cat dog";

        boolean excepted = false;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);

    }

    //Input: pattern = "abba", s = "dog dog dog dog"
    //Output: false
    @Test
    void wordPattern_case_4() {

        String pattern = "abba";
        String s = "dog dog dog dog";

        boolean excepted = false;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);

    }

    //Input: pattern = "abba", s = "dog dog dog dog"
    //Output: false
    @Test
    void wordPattern_case_5() {

        String pattern = "jquerry";
        String s = "jquerry";

        boolean excepted = false;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);

    }

    //Input: pattern = "a", s = "a
    //Output: true
    @Test
    void wordPattern_case_6() {

        String pattern = "a";
        String s = "a";

        boolean excepted = true;
        boolean actual = wordPattern.wordPattern(pattern, s);

        assertEquals(excepted,actual);
    }

}