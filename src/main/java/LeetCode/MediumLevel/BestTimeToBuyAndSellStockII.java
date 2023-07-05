package LeetCode.MediumLevel;


//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//On each day, you may decide to buy and/or sell the stock. You can only hold at most
// one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//Find and return the maximum profit you can achieve.
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {

        int minPrice = 0;
        int maxPrice = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(maxPrice > prices[i] && minPrice < prices[i]){
                minPrice = prices[i];
            } else {
                profit = profit + (maxPrice - minPrice);
                maxPrice = prices[i];
                minPrice = 0;
            }

        }

        System.out.println(maxPrice);
        System.out.println(minPrice);

        return profit;
    }

}
