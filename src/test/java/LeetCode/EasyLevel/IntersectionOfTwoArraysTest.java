package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 1000
class IntersectionOfTwoArraysTest {

    private static IntersectionOfTwoArrays intersection;

    @BeforeAll
    public static void initMethod(){
        intersection = new IntersectionOfTwoArrays();
    }

    //Input: nums1 = [1,2,2,1], nums2 = [2,2]
    //Output: [2]
    @Test
    void intersection_case_1() {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expected = {2};


        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        int[] actual = intersection.intersection(nums1,nums2);

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");

        assertArrayEquals(expected,actual);

    }

    //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    //Output: [9,4]
    //Explanation: [4,9] is also accepted.
    @Test
    void intersection_case_2() {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,};
        int[] expected = {4,9};

        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        int[] actual = intersection.intersection(nums1,nums2);

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");

        assertArrayEquals(expected,actual);

    }
}