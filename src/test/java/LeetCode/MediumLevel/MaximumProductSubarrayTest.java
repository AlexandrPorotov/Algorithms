package LeetCode.MediumLevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//Constraints:
//
//1 <= nums.length <= 2 * 104
//-10 <= nums[i] <= 10
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
class MaximumProductSubarrayTest {

    private static MaximumProductSubarray maximumProductSubarray;

    @BeforeAll
    public static void initMethod(){
        maximumProductSubarray = new MaximumProductSubarray();
    }

    public static int timeAndMemoryProxyMaxProduct(int[] nums){
        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        int result = maximumProductSubarray.maxProduct(nums);

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");

        return result;
    }

    //Input: nums = [2,3,-2,4]
    //Output: 6
    //Explanation: [2,3] has the largest product 6.
    @Test
    void maxProduct_case_1() {

        int[] nums = {2,3,-2,4};
        int expected = 6;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [-2,0,-1]
    //Output: 0
    //Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    @Test
    void maxProduct_case_2() {

        int[] nums = {-2,0,-1};
        int expected = 0;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [3,-1,4]
    //Output: 4
    @Test
    void maxProduct_case_3() {

        int[] nums = {3,-1,4};
        int expected = 4;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [-3,-1,-1]
    //Output: 3
    @Test
    void maxProduct_case_4() {

        int[] nums = {-3,-1,-1};
        int expected = 3;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [0,2]
    //Output: 2
    @Test
    void maxProduct_case_5() {

        int[] nums = {0,2};
        int expected = 2;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [-2,3,-4]
    //Output: 2
    @Test
    void maxProduct_case_6() {

        int[] nums = {-2,3,-4};
        int expected = 24;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }

    //Input: nums = [-3, 0, 1, -2]
    //Output: 1
    @Test
    void maxProduct_case_7() {

        int[] nums = {-3, 0, 1, -2};
        int expected = 1;
        System.out.println("Input = " + Arrays.toString(nums));

        int actual = timeAndMemoryProxyMaxProduct(nums);

        Assertions.assertEquals(expected, actual);

    }
}