package Trenings03.Lesson1Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketSequenceTest {

    @Test
    void test_checkSimpleSequence() {

        String sequence = "()()(())";
        boolean result = BracketSequence.checkSimpleSequence(sequence);

        assertTrue(result);

    }

    @Test
    void test_negative_checkSimpleSequence() {

        String sequence = "()()(()))";
        boolean result = BracketSequence.checkSimpleSequence(sequence);

        assertFalse(result);

    }

    @Test
    void test_checkSequence() {
        String sequence = "{[([][]{})[]{}]}";
        boolean result = BracketSequence.checkSequence(sequence);

        assertTrue(result);
    }

    @Test
    void test_negative_checkSequence() {
        String sequence = "{()()}[](({{)))";
        boolean result = BracketSequence.checkSequence(sequence);

        assertFalse(result);
    }

}