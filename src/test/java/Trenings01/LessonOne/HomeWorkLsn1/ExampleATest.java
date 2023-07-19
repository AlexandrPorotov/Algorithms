package Trenings01.LessonOne.HomeWorkLsn1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleATest {

    //general case
    @Test
    public void testFoo_10_20_heat() {

            int[] temperature = new int[]{10,20};
            String mode = "heat";

            int result = ExampleA.foo(temperature,mode);

            assertEquals(20, result);

    }

    //general case
    @Test
    public void testFoo_30_20_heat() {

        int[] temperature = new int[]{30,20};
        String mode = "heat";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(30, result);

    }

    //general case
    @Test
    public void testFoo_10_20_freeze(){

        int[] temperature = new int[]{10,20};
        String mode = "freeze";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //general case
    @Test
    public void testFoo_20_10_freeze(){

        int[] temperature = new int[]{20,10};
        String mode = "freeze";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //general case
    @Test
    public void testFoo_10_20_auto(){

        int[] temperature = new int[]{10,20};
        String mode = "auto";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(20, result);
    }

    //general case
    @Test
    public void testFoo_10_20_fan(){

        int[] temperature = new int[]{10,20};
        String mode = "fan";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //edge case
    @Test
    public void testFoo_10_10_heat(){

        int[] temperature = new int[]{10,10};
        String mode = "heat";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //edge case
    @Test
    public void testFoo_10_10_freeze(){

        int[] temperature = new int[]{10,10};
        String mode = "freeze";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //edge case
    @Test
    public void testFoo_10_10_auto(){

        int[] temperature = new int[]{10,10};
        String mode = "auto";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //edge case
    @Test
    public void testFoo_10_10_fan(){

        int[] temperature = new int[]{10,10};
        String mode = "fan";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(10, result);

    }

    //empty case
    @Test
    public void testFoo_empty_case(){

        int[] temperature = new int[2];
        String mode = "fan";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(0, result);

    }

    //negative ints
    @Test
    public void testFoo_negative_int_heat(){

        int[] temperature = new int[]{-20,-10};
        String mode = "heat";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(-10, result);

    }

    //negative ints
    @Test
    public void testFoo_negative_int_freeze(){

        int[] temperature = new int[]{-20,-30};
        String mode = "freeze";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(-30, result);

    }

    //negative ints
    @Test
    public void testFoo_negative_int_auto(){

        int[] temperature = new int[]{-20,-30};
        String mode = "auto";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(-30, result);

    }

    //negative ints
    @Test
    public void testFoo_negative_int_fan(){

        int[] temperature = new int[]{-20,-30};
        String mode = "fan";

        int result = ExampleA.foo(temperature,mode);

        assertEquals(-20, result);

    }

}