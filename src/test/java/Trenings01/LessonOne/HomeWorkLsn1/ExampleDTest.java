package Trenings01.LessonOne.HomeWorkLsn1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleDTest {

    //general case
    @Test
    public void fooTest_general_case_one() {

        String actual = ExampleD.foo(1,0,0);
        String expect = "0";

        assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_two() {

        String actual = ExampleD.foo(1,2,3);
        String expect = "7";

        assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_three() {

        String actual = ExampleD.foo(1,2,-3);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_zero() {

        String actual = ExampleD.foo(0,0,0);
        String expect = "MANY SOLUTIONS";

        assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_1() {

        String actual = ExampleD.foo(1,1,1);
        String expect = "0";

        assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_negative() {

        String actual = ExampleD.foo(-1,-1,-1);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    //pairwise tests
    @Test
    public void fooTest_pairwise_1_1_1() {

        String actual = ExampleD.foo(1,1,1);
        String expect = "0";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_1_m1_m1() {

        String actual = ExampleD.foo(1,-1,-1);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_0_0_m1() {

        String actual = ExampleD.foo(0,0,-1);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_0_m1_1() {

        String actual = ExampleD.foo(0,-1,1);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_0_1_0() {

        String actual = ExampleD.foo(0,1,0);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_m1_m1_0() {

        String actual = ExampleD.foo(-1,-1,0);
        String expect = "-1";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_m1_1_m1() {

        String actual = ExampleD.foo(-1,1,-1);
        String expect = "NO SOLUTION";

        assertEquals(expect,actual);

    }

    @Test
    public void fooTest_pairwise_m1_0_1() {

        String actual = ExampleD.foo(-1,0,1);
        String expect = "-1";

        assertEquals(expect,actual);

    }
}