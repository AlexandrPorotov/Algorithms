package Trenings01.LessonTwo.Solutions;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RleFunctionTest {

    //@Test
    public void rle_A_3_B_4_C_4_D_5() {

        String input = "AAABBBBCCCCDDDDD";

        String expect = "A3B4C4D5";

        try {
            String actual = RleFunction.rle(input);
            assertEquals(expect, actual);
        } catch (NullPointerException | IOException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println("Test failed");
        }

    }

    @Test
    public void rle_A4_B3_C2_XYZ_D4_E3_F3_A6_B28() throws IOException {

        String input = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";

        String expect = "A4B3C2XYZD4E3F3A6B2";

        String actual = RleFunction.rle(input);

        assertEquals(expect,actual);

    }

    @Test
    public void rle_null() throws IOException {
        RleFunction.rle(null);
    }

    @Test
    public void rle_empty() throws IOException {
        RleFunction.rle("");
    }

    @Test
    public void rle_null_exMessage(){
        try {
            RleFunction.rle(null);
        }catch (NullPointerException | IOException e){
            String actual = e.getMessage();
            assertEquals("String input = null;", actual);
        }
    }
    @Test
    public void rle_empty_exMessage(){
        try {
            RleFunction.rle("");
        }catch (NullPointerException | IOException e){
            String actual = e.getMessage();
            assertEquals("String input = \"\";", actual);
        }
    }
}