package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private static LengthOfLastWord lengthOfLastWord;

    @BeforeAll
    static void initMethod(){
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWord_case1() {

        String input = "Hello World";
        int expected = 5;

        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertEquals(expected,actual);

    }

    @Test
    void lengthOfLastWord_case2() {

        String input = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertEquals(expected,actual);

    }

    @Test
    void lengthOfLastWord_case3() {

        String input = "luffy is still joyboy";
        int expected = 6;
        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertEquals(expected,actual);

    }
}