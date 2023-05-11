package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private static PlusOne plusOne;

    @BeforeAll
    public static void initMethod(){
        plusOne = new PlusOne();
    }
    @Test
    void plusOne_case1() {

        int[] expected = {1,2,4};
        int[] actual = plusOne.plusOne(new int[] {1,2,3});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case2() {

        int[] expected = {4,3,2,2};
        int[] actual = plusOne.plusOne(new int[] {4,3,2,1});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case3() {

        int[] expected = {1,0};
        int[] actual = plusOne.plusOne(new int[] {9});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case4() {

        int[] expected = {9,8,7,6,5,4,3,2,1,1};
        int[] actual = plusOne.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case5() {

        int[] expected = {1,0,0};
        int[] actual = plusOne.plusOne(new int[] {9,9});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case6() {

        int[] expected = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7};
        int[] actual = plusOne.plusOne(new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }

    @Test
    void plusOne_case7() {

        int[] expected = {2,0};
        int[] actual = plusOne.plusOne(new int[] {1,9});

        for(int i = 0; i < expected.length; i++){
            System.out.println("i = " + i);
            assertEquals(expected[i],actual[i]);
        }
        assertArrayEquals(expected,actual);

    }
}