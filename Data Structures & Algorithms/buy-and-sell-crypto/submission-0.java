class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxSum = 0;
        for(int i = 0 ; i < n ; i++){
            int initial = prices[i];
            for(int j = i+1 ; j < n ; j++){
                int trialnum = prices[j];
                int diff = trialnum - initial;
                maxSum = Math.max(maxSum,diff);
            }
        }
        return maxSum;
    }
}
