package LessonOne.HomeWork;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleDTest {

    //general case
    @Test
    public void fooTest_general_case_one() {

        String actual = ExampleD.foo(1,0,0);
        String expect = "0";

        Assert.assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_two() {

        String actual = ExampleD.foo(1,2,3);
        String expect = "7";

        Assert.assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_three() {

        String actual = ExampleD.foo(1,2,-3);
        String expect = "NO SOLUTION";

        Assert.assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_zero() {

        String actual = ExampleD.foo(0,0,0);
        String expect = "MANY SOLUTIONS";

        Assert.assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_1() {

        String actual = ExampleD.foo(1,1,1);
        String expect = "0";

        Assert.assertEquals(expect,actual);

    }

    //general case
    @Test
    public void fooTest_general_case_all_negative() {

        String actual = ExampleD.foo(-1,-1,-1);
        String expect = "NO SOLUTION";

        Assert.assertEquals(expect,actual);

    }


}