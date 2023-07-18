package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

//Constraints:
//
//0 <= rowIndex <= 33
// Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
class PascalsTriangleIITest {

    private static PascalsTriangleII pascalsTriangleII;

    @BeforeAll
    public static void initMethod(){
        pascalsTriangleII = new PascalsTriangleII();
    }

    public static List<Integer> timerProxyGetTriangle(int rowIndex){
        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        List<Integer> result = pascalsTriangleII.getRow(rowIndex);

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");

        return result;
    }

    //Input: rowIndex = 3
    //Output: [1,3,3,1]
    @Test
    void getRow_case_1() {

        int input = 3;
        List<Integer> expected = List.of(1,3,3,1);
        System.out.println("Input index = 3" + "\nInput list = " + expected);
        List<Integer> actual = timerProxyGetTriangle(input);

        assertIterableEquals(expected,actual);

    }

    //Input: rowIndex = 0
    //Output: [1]
    @Test
    void getRow_case_2() {

        int input = 0;
        List<Integer> expected = List.of(1);
        System.out.println("Input index = 3" + "\nInput list = " + expected);
        List<Integer> actual = timerProxyGetTriangle(input);

        assertIterableEquals(expected,actual);

    }

    //Input: rowIndex = 1
    //Output: [1,1]
    @Test
    void getRow_case_3() {

        int input = 1;
        List<Integer> expected = List.of(1,1);
        System.out.println("Input index = 3" + "\nInput list = " + expected);
        List<Integer> actual = timerProxyGetTriangle(input);

        assertIterableEquals(expected,actual);

    }
}