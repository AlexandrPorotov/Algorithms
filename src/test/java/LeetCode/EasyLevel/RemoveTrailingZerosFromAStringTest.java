package LeetCode.EasyLevel;

import LeetCode.EasyLevel.RemoveTrailingZerosFromAString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//1 <= num.length <= 1000
//num consists of only digits.
//num doesn't have any leading zeros.
class RemoveTrailingZerosFromAStringTest {

    private static RemoveTrailingZerosFromAString removeTrailingZerosFromAString;

    @BeforeAll
    public static void ititMethod(){
        removeTrailingZerosFromAString = new RemoveTrailingZerosFromAString();
    }

    //Input: num = "51230100"
    //Output: "512301"
    //Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
    @Test
    void removeTrailingZeros_case_1() {

        String input = "51230100";
        String expected = "512301";

        String actual = removeTrailingZerosFromAString.removeTrailingZeros(input);

        assertEquals(expected,actual);
    }


    //Input: num = "123"
    //Output: "123"
    //Explanation: Integer "123" has no trailing zeros, we return integer "123".
    @Test
    void removeTrailingZeros_case_2() {

        String input = "123";
        String expected = "123";

        String actual = removeTrailingZerosFromAString.removeTrailingZeros(input);

        assertEquals(expected,actual);
    }


    //Input: num = "123000"
    //Output: "123"
    @Test
    void removeTrailingZeros_case_3() {

        String input = "123000";
        String expected = "123";

        String actual = removeTrailingZerosFromAString.removeTrailingZeros(input);

        assertEquals(expected,actual);
    }
}