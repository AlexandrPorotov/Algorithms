package Trenings01.LessonOne.HomeWorkLsn1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleBTest {

    //general case
    @Test
    public void testFoo_a3_b4_c5() {

        int a = 3;
        int b = 4;
        int c = 5;

        String result = ExampleB.foo(a,b,c);

        assertEquals("YES",result);

    }

    //general case
    @Test
    public void testFoo_a3_b5_c4() {

        int a = 3;
        int b = 5;
        int c = 4;

        String result = ExampleB.foo(a,b,c);

        assertEquals("YES",result);

    }

    //general case
    @Test
    public void testFoo_a4_b5_c3() {

        int a = 4;
        int b = 5;
        int c = 3;

        String result = ExampleB.foo(a,b,c);

        assertEquals("YES", result);

    }

    //negative ints
    @Test
    public void testFoo_negative_ints(){

        int a = -4;
        int b = -5;
        int c = -3;

        String result = ExampleB.foo(a,b,c);

        assertEquals("NO", result);

    }

    //zero
    @Test
    public void testFoo_zero(){

        String result = ExampleB.foo(0,0,0);
        assertEquals("NO", result);

    }

    //negative case
    @Test
    public void testFoo_negative_a7_b11_c4(){

        int a = 6;
        int b = 14;
        int c = 7;

        String result = ExampleB.foo(a,b,c);

        assertEquals("NO", result);

    }

    //one int negative
    @Test
    public void testFoo_negative_a4_bMinus5_c3(){

        int a = 4;
        int b = -5;
        int c = 3;

        String result = ExampleB.foo(a,b,c);

        assertEquals("NO", result);

    }

    //one int zero
    @Test
    public void testFoo_oneIntZero_a4_b0_c3(){

        int a = 4;
        int b = 0;
        int c = 3;

        String result = ExampleB.foo(a,b,c);

        assertEquals("NO", result);

    }
}