package LeetCode.EasyLevel;

import LeetCode.EasyLevel.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= prices.length <= 105
//0 <= prices[i] <= 104
class BestTimeToBuyAndSellStockTest {

    private static BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeAll
    public static void initMethod(){
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }


    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    @Test
    void maxProfit_test_1() {

        int[] prices = {7,1,5,3,6,4};
        int expected = 5;

        int actual = bestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(expected,actual);

    }


    //Input: prices = [7,6,4,3,1]
    //Output: 0
    //Explanation: In this case, no transactions are done and the max profit = 0.
    @Test
    void maxProfit_test_2() {

        int[] prices = {7,6,4,3,1};
        int expected = 0;

        int actual = bestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(expected,actual);

    }

    //Input: prices = [2,4,1]
    //Output: 2
    @Test
    void maxProfit_test_3() {

        int[] prices = {2,4,1};
        int expected = 2;

        int actual = bestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(expected,actual);

    }


}