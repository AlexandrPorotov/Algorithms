package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    private static AddBinary addBinary;
    @BeforeAll
    public static void initMethod(){
        addBinary = new AddBinary();
    }

    @Test
    void addBinary_case_1() {

        String a = "11";
        String b = "1";
        String actual = addBinary.addBinary(a,b);

        String expected = "100";

        assertEquals(expected,actual);

    }

    @Test
    void addBinary_case_2() {

        String a = "1010";
        String b = "1011";
        String actual = addBinary.addBinary(a,b);

        String expected = "10101";

        assertEquals(expected,actual);

    }

    @Test
    void binaryToInteger() {

        Long actual = addBinary.binaryToInteger("110001");
        Long expected = 49L;

        assertEquals(expected,actual);
    }
}