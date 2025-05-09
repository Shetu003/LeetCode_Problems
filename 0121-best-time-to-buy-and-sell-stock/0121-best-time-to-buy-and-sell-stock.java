//sliding window
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                int currProfit = prices[i] - buyPrice;
                profit = Math.max(currProfit, profit);
            }
        }
        return profit;
    }
}

//DP
// public class Solution {
//     public int maxProfit(int[] prices) {
//         int maxP = 0;
//         int minBuy = prices[0];

//         for (int sell : prices) {
//             maxP = Math.max(maxP, sell - minBuy);
//             minBuy = Math.min(minBuy, sell);
//         }
//         return maxP;
//     }
// }
