package LeetCode.EasyLevel;

import LeetCode.EasyLevel.CanPlaceFlowers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//0 <= n <= flowerbed.length

class CanPlaceFlowersTest {

    private static CanPlaceFlowers canPlaceFlowers;

    @BeforeAll
    public static void initMethod(){
        canPlaceFlowers = new CanPlaceFlowers();
    }


    //Input: flowerbed = [1,0,0,0,1], n = 1
    //Output: true
    @Test
    void canPlaceFlowers_case_1() {

        int[] input = {1,0,0,0,1};
        int n = 1;

        boolean expected = true;

        boolean actual = canPlaceFlowers.canPlaceFlowers(input,n);

        assertEquals(expected,actual);

    }


    //Input: flowerbed = [1,0,0,0,1], n = 2
    //Output: false
    @Test
    void canPlaceFlowers_case_2() {

        int[] input = {1,0,0,0,1};
        int n = 2;

        boolean expected = false;

        boolean actual = canPlaceFlowers.canPlaceFlowers(input,n);

        assertEquals(expected,actual);

    }

    //Input: flowerbed = [0,0,1,0,0], n = 2
    //Output: true
    @Test
    void canPlaceFlowers_case_3() {

        int[] input = {0,0,1,0,0};
        int n = 2;

        boolean expected = true;

        boolean actual = canPlaceFlowers.canPlaceFlowers(input,n);

        assertEquals(expected,actual);

    }
    //Input: flowerbed = [1,0,0,0,0,0,1], n = 2
    //Output: true
    @Test
    void canPlaceFlowers_case_4() {

        int[] input = {1,0,0,0,0,0,1};
        int n = 2;

        boolean expected = true;

        boolean actual = canPlaceFlowers.canPlaceFlowers(input,n);

        assertEquals(expected,actual);

    }


    //Input: flowerbed = [1,0,0,0,0,1], n = 2
    //Output: true
    @Test
    void canPlaceFlowers_case_5() {

        int[] input = {1,0,0,0,0,1};
        int n = 2;

        boolean expected = false;

        boolean actual = canPlaceFlowers.canPlaceFlowers(input,n);

        assertEquals(expected,actual);

    }

}