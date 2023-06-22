package LeetCode.EasyLevel;

import LeetCode.EasyLevel.PascalsTriangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= numRows <= 30
class PascalsTriangleTest {

    private static PascalsTriangle pascalsTriangle;

    @BeforeAll
    public static void initMethod(){
        pascalsTriangle = new PascalsTriangle();
    }


    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    @Test
    void generate_case_1() {

        int input = 5;
        String expected = "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]";

        String actual = pascalsTriangle.generate(input).toString();

        assertEquals(expected, actual);

    }

    //Input: numRows = 1
    //Output: [[1]]
    @Test
    void generate_case_2() {

        int input = 1;
        String expected = "[[1]]";

        String actual = pascalsTriangle.generate(input).toString();

        assertEquals(expected, actual);

    }
}