package Trenings01.LessonOne.HomeWorkLsn1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleCTest {

    //general case
    @Test
    public void testFoo_example_one_general_case() {

        String newNumber = "8(495)430-23-97";
        String[] numbers = new String[]{
           "+7-4-9-5-43-023-97", "4-3-0-2-3-9-7", "8-495-430"
        };

        String[] result = ExampleC.foo(newNumber, numbers);

        assertEquals("YES", result[0]);
        assertEquals("YES", result[1]);
        assertEquals("NO", result[2]);

    }

    //general case
    @Test
    public void testFoo_example_two_general_case() {

        String newNumber = "86406361642";
        String[] numbers = new String[]{
                "83341994118", "86406361642", "83341994118"
        };

        String[] result = ExampleC.foo(newNumber, numbers);

        assertEquals("NO", result[0]);
        assertEquals("YES", result[1]);
        assertEquals("NO", result[2]);

    }

    //general case
    @Test
    public void testFoo_example_three_general_case() {

        String newNumber = "+78047952807";
        String[] numbers = new String[]{
                "+78047952807", "+76147514928", "88047952807"
        };

        String[] result = ExampleC.foo(newNumber,numbers);

        assertEquals("YES", result[0]);
        assertEquals("NO", result[1]);
        assertEquals("YES", result[2]);

    }

    //wrong code and short number
    @Test
    public void testFoo_example_shortNumber_general_case() {

        String newNumber = "+7(495)833-29-77";
        String[] numbers = new String[]{
                "833-29-77", "84958332977", "8-833-29-77"
        };

        String[] result = ExampleC.foo(newNumber,numbers);

        assertEquals("YES", result[0]);
        assertEquals("YES", result[1]);
        assertEquals("NO", result[2]);

    }

    @Test
    public void numberHandlerTest_with_dash() {

        String numberWithDash = "+7-4-9-5-43-023-97";

        String[] actual = ExampleC.numberHandler(numberWithDash);
        String[] expect = new String[]{"495","4302397"};

        assertEquals(expect[0],actual[0]);
        assertEquals(expect[1],actual[1]);

    }

    @Test
    public void numberHandlerTest_bad_number() {

        String numberWithDash = "+8(495)430-23-97";

        String[] actual = ExampleC.numberHandler(numberWithDash);
        String[] expect = new String[]{"495","4302397"};

        assertEquals(expect[0],actual[0]);
        assertEquals(expect[1],actual[1]);

    }
}