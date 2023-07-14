package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


//Constraints:
//
//2 <= seats.length <= 2 * 104
//seats[i] is 0 or 1.
//At least one seat is empty.
//At least one seat is occupied.
class MaximizeDistanceToClosestPersonTest {

    private static MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson;

    @BeforeAll
    public static void initMethod(){
        maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson();
    }

    //Input: seats = [1,0,0,0,1,0,1]
    //Output: 2
    //Explanation:
    //If Alex sits in the second open seat (i.e. seats[2]), then the closest person has distance 2.
    //If Alex sits in any other open seat, the closest person has distance 1.
    //Thus, the maximum distance to the closest person is 2.
    @Test
    void maxDistToClosest_case_1() {

        int[] seats = {1,0,0,0,1,0,1};
        int expected = 2;
        System.out.println("Input = " + Arrays.toString(seats));

        int actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats);


        assertEquals(expected,actual);

    }

    //Input: seats = [1,0,0,0]
    //Output: 3
    //Explanation:
    //If Alex sits in the last seat (i.e. seats[3]), the closest person is 3 seats away.
    //This is the maximum distance possible, so the answer is 3.
    @Test
    void maxDistToClosest_case_2() {

        int[] seats = {1,0,0,0};
        int expected = 3;
        System.out.println("Input = " + Arrays.toString(seats));

        int actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats);


        assertEquals(expected,actual);

    }

    //Input: seats = [0,1]
    //Output: 1
    @Test
    void maxDistToClosest_case_3() {

        int[] seats = {0,1};
        int expected = 1;
        System.out.println("Input = " + Arrays.toString(seats));

        int actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats);

        assertEquals(expected,actual);

    }

    //Input: seats = [0,1]
    //Output: 1
    @Test
    void maxDistToClosest_case_4() {

        int[] seats = {0,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,1,0,0,0};
        int expected = 3;
        System.out.println("Input = " + Arrays.toString(seats));

        int actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats);

        assertEquals(expected,actual);

    }

    //Input: seats = [0,0,0,0,0,0,0,1]
    //Output: 1
    @Test
    void maxDistToClosest_case_5() {

        int[] seats = {0,0,0,0,0,0,0,1};
        int expected = 7;
        System.out.println("Input = " + Arrays.toString(seats));

        int actual = maximizeDistanceToClosestPerson.maxDistToClosest(seats);

        assertEquals(expected,actual);

    }
}