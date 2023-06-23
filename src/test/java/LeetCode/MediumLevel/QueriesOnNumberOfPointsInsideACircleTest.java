package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

////Constraints:
////
////1 <= points.length <= 500
////points[i].length == 2
////0 <= xi, yi <= 500
////1 <= queries.length <= 500
////queries[j].length == 3
////0 <= xj, yj <= 500
////1 <= rj <= 500
////All coordinates are integers.
class QueriesOnNumberOfPointsInsideACircleTest {

    private static QueriesOnNumberOfPointsInsideACircle queriesOnNumberOfPointsInsideACircle;

    @BeforeAll
    public static void initMethod(){
        queriesOnNumberOfPointsInsideACircle = new QueriesOnNumberOfPointsInsideACircle();
    }

    //Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
    //Output: [3,2,2]
    //Explanation: The points and circles are shown above.
    //queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.
    @Test
    void countPoints_case_1() {

        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};

        int[] expected = {3,2,2};
        int[] actual = queriesOnNumberOfPointsInsideACircle.countPoints(points,queries);

        System.out.println("expected " + Arrays.toString(expected));
        System.out.println("actual " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    //Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
    //Output: [2,3,2,4]
    //Explanation: The points and circles are shown above.
    //queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is purple.
    @Test
    void countPoints_case_2() {

        int[][] points = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};

        int[] expected = {2,3,2,4};
        int[] actual = queriesOnNumberOfPointsInsideACircle.countPoints(points,queries);

        System.out.println("expected " + Arrays.toString(expected));
        System.out.println("actual " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}