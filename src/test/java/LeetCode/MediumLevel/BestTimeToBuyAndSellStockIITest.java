package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= prices.length <= 3 * 104
//0 <= prices[i] <= 104
class BestTimeToBuyAndSellStockIITest {

    private static BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII;

    @BeforeAll
    public static void initMethod(){
        bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
    }

    //Input: prices = [7,1,5,3,6,4]
    //Output: 7
    //Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    //Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    //Total profit is 4 + 3 = 7.
    @Test
    void maxProfit_case_1() {

        int[] prices = {7,1,5,3,6,4};
        int expected = 7;
        int actual = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected,actual);

    }

    //Input: prices = [1,2,3,4,5]
    //Output: 4
    //Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
    //Total profit is 4.
    @Test
    void maxProfit_case_2() {

        int[] prices = {1,2,3,4,5};
        int expected = 4;
        int actual = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected,actual);

    }

    //Input: prices = [7,6,4,3,1]
    //Output: 0
    //Explanation: There is no way to make a positive profit, so we never buy the stock to achieve
    // the maximum profit of 0.
    @Test
    void maxProfit_case_3() {

        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int actual = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected,actual);

    }
}