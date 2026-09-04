class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxSum = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxSum = Math.max(profit, maxSum);
            }
            else
                l = r;
            r++;
        }
        return maxSum;    
    }
}
