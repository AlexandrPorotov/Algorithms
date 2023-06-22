package LeetCode.EasyLevel;


//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
// to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Constraints:
//
//1 <= prices.length <= 105
//0 <= prices[i] <= 104
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        int buffProfit;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }
            buffProfit = price - minPrice;
            if (maxProfit < buffProfit) {
                maxProfit = buffProfit;
            }
        }

        return maxProfit;
    }
}
