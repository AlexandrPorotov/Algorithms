package Trenings03.Lesson1Stack;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatingTheExpressionTest {

    private static String one;
    private static String two;
    private static String three;
    private static String four;
    private static String five;

    @BeforeAll
    static void initExpressions(){
        one = "8*(9+3-2*2)*(7+4-9)/2=64=893+22*-*74+9-*2/";
        two = "(3+4)*9+8*(7-2)=103=34+9*872-*+";
        three = "6/3+5-2-(6-1)=0=63/5+2-61--";
        four = "6+3*(1+4*5)*2=132=63145*+*2*+";
        five = "1+3/3+1*(5*2/5)=4=133/+152*5/*+";
    }

    static Stream<String> stringFactory() {
        return Stream.of(one, two, three, four, five);
    }

    @Test
    @Timeout(1000)
    @DisplayName("Проверка выполнения мат.операций")
    void test_plus_makeOperation() {
        int a = 1;
        int b = 3;
        char operator = '+';

        int result = CalculatingTheExpression.makeOperation(a,b,operator);

        assertEquals(4,result);

    }


    // <ПЕРЕПИСАТЬ>
    @Test
    @Timeout(1000)
    @DisplayName("Проверка конвертации (строки)")
    void test_normal_input_convertExpressionToStringArray() {

        String inputString = "35+45*(3+4/2)/956+45922";

        List<String> actualResult = CalculatingTheExpression.convertExpressionToStringArray(inputString);

        List<String> expectedList = Arrays.asList("35","+","45","*","(","3","+","4","/","2",")","/","956","+","45922");


        boolean flag = false;
        for(int i = 0; i < expectedList.size(); i++) {

            if(expectedList.get(i).equals(actualResult.get(i))){
                flag = true;
            } else {
                System.out.println("Not equals; Expected " + expectedList.get(i) + "; Actual = " + actualResult.get(i)+";" + " i = " + i);
            }

        }
        System.out.println(actualResult);
        assertTrue(flag);

    }

    //@ParameterizedTest
    @Timeout(1000)
    @DisplayName("Проверка конвертации")
    @MethodSource("stringFactory")
    void test_converterToPostfix(String inputString) {

        String actual = CalculatingTheExpression.converterToPostfix(inputString.split("=")[0]);

        String expected = inputString.split("=")[2];

        System.out.println("EXPECTED: "+ expected);
        System.out.println("ACTUAL: "+ actual);
        assertEquals(expected,actual);


    }



    //@ParameterizedTest
    @Timeout(1000)
    @DisplayName("Проверка вычисления")
    @MethodSource("stringFactory")
    void test_calculations(String inputString) {

        Integer expected = Integer.parseInt(inputString.split("=")[1]);

        Integer actual = CalculatingTheExpression.calculations(inputString.split("=")[0]);

        assertEquals(expected,actual);
        System.out.println(inputString);

    }
}