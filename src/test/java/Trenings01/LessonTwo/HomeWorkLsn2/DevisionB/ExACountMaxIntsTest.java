package Trenings01.LessonTwo.HomeWorkLsn2.DevisionB;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;


class ExACountMaxIntsTest {

    //набор массивов для теста
    private static int[] inputArraySimply;
    private static int[] inputArrayAllZero;
    private static int[] inputArrayMaxInIndex0;
    private static int[] inputArrayCaseOne;
    private static int[] inputArrayCaseTwo;
    private static int[] inputArrayCaseAllMinus;
    private static int[] inputArrayElse;

    @BeforeAll
    static void initArray(){

        inputArraySimply = new int[] {1, 2, 3, 4, 5, 6, 7, 4, 3, 21, 3, 5, 6, 78, 9, 0, 423, 3, 4, 0}; //max = 423
        inputArrayAllZero = new int[] {0, 0, 0, 0, 0, 0, 0}; // max : null
        inputArrayMaxInIndex0 = new int[] {12, 3, 0, 4, 3, 2}; //max 12
        inputArrayCaseOne = new int[] {1, 7, 9, 0}; //max 9
        inputArrayCaseTwo = new int[] {1, 3, 3, 1, 0}; //max 3
        inputArrayCaseAllMinus = new int[] {-3,-1,-2,-4,-5,-1}; // max -1
        inputArrayElse = new int[] {-1,0,1,1};


    }

    static Stream<int[]> arrayFactory() {
        return Stream.of(inputArraySimply,inputArrayAllZero, inputArrayMaxInIndex0,inputArrayCaseOne,inputArrayCaseTwo, inputArrayCaseAllMinus, inputArrayElse);
    }



    @ParameterizedTest
    @Timeout(1000)
    @DisplayName("Проверка поиска максимума (значения)")
    @MethodSource("arrayFactory")
    public void findIndexMaxValue_test(int[] inputArray) {

        int indexOfMaxValue = ExACountMaxInts.findIndexMaxValue(inputArray);
        int actual = inputArray[indexOfMaxValue];
        OptionalInt expected = Arrays.stream(inputArray).max();

        Assertions.assertEquals(expected.getAsInt(),actual);
        System.out.println("EXPECTED: " + expected.getAsInt() + "\n" + "ACTUAL: " + actual);

    }

    @ParameterizedTest
    @Timeout(1000)
    @DisplayName("Проверка подсчета кол-ва максимумов")
    @MethodSource("arrayFactory")
    void countMaximums(int[] inputArray) {

        int actual = ExACountMaxInts.countMaximums(inputArray);
        OptionalInt maxInt = Arrays.stream(inputArray).max();

        int expected = (int) Arrays.stream(inputArray).filter(i -> i == maxInt.getAsInt()).count();

        Assertions.assertEquals(expected,actual);

        System.out.println("EXPECTED: " + expected + "\n" + "ACTUAL: " + actual);

    }
}