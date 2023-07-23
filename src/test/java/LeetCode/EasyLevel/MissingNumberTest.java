package LeetCode.EasyLevel;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


//Constraints:
//
//n == nums.length
//1 <= n <= 104
//0 <= nums[i] <= n
//All the numbers of nums are unique.
class MissingNumberTest {

    private static MissingNumber missingNumber;
    private static Runtime runtime;
    private static long startTime;
    private static long memoryBefore;
    @BeforeAll
    public static void initMethod(){
        missingNumber = new MissingNumber();
    }

    @BeforeEach
    public void timeAndMemoryCounter(){
        startTime = System.nanoTime();
        runtime = Runtime.getRuntime();
        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
    }

    @AfterEach
    public void logTimeAndMemory(){
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");
    }

    //Input: nums = [3,0,1]
    //Output: 2
    //Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
    //2 is the missing number in the range since it does not appear in nums.
    @Test
    @DisplayName("Case 1")
    void missingNumber_case_1() {

        int[] nums = {3,0,1};
        System.out.println("input = " + Arrays.toString(nums));
        int expected = 2;
        int actual = missingNumber.missingNumber(nums);

        assertEquals(expected,actual);

    }

    //Input: nums = [0,1]
    //Output: 2
    //Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
    //2 is the missing number in the range since it does not appear in nums.
    @Test
    @DisplayName("Case 2")
    void missingNumber_case_2() {

        int[] nums = {0,1};
        System.out.println("input = " + Arrays.toString(nums));
        int expected = 2;
        int actual = missingNumber.missingNumber(nums);

        assertEquals(expected,actual);

    }

    //Input: nums = [9,6,4,2,3,5,7,0,1]
    //Output: 8
    //Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
    //8 is the missing number in the range since it does not appear in nums.
    @Test
    @DisplayName("Case 3")
    void missingNumber_case_3() {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("input = " + Arrays.toString(nums));
        int expected = 8;
        int actual = missingNumber.missingNumber(nums);

        assertEquals(expected,actual);

    }
}