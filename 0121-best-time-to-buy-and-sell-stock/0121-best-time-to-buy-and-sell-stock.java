class Solution {
    public int maxProfit(int[] prices) {
        int BuyPrice = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < BuyPrice){
                BuyPrice = prices[i];
            }
            else{
                int currProfit = prices[i] - BuyPrice;
                profit = Math.max(currProfit, profit);
            }
        }
        return profit;
    }
}