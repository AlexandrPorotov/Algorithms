package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.
class ValidParenthesesTest {

    private static ValidParentheses validParentheses;

    @BeforeAll
    public static void initMethod(){
        validParentheses = new ValidParentheses();
    }

    //Example 1:
    //
    //Input: s = "()"
    //Output: true
    @Test
    void isValid_case_1() {

        String input = "()";
        boolean expected = true;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }


    //Example 2:
    //
    //Input: s = "()[]{}"
    //Output: true
    @Test
    void isValid_case_2() {

        String input = "()[]{}";
        boolean expected = true;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }

    //Example 3:
    //
    //Input: s = "(]"
    //Output: false
    @Test
    void isValid_case_3() {

        String input = "(]";
        boolean expected = false;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }


    //Input s = "){"
    //Output: false
    @Test
    void isValid_case_4() {

        String input = "){";
        boolean expected = false;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }

    //Input s = "["
    //Output: false
    @Test
    void isValid_case_5() {

        String input = "[";
        boolean expected = false;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }


    //Input s = "(){}}{"
    //Output: false
    @Test
    void isValid_case_6() {

        String input = "(){}}{";
        boolean expected = false;

        boolean actual = validParentheses.isValid(input);

        assertEquals(expected,actual);
    }

}