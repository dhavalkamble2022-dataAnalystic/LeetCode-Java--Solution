class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mp=0;
        int bestbuy=prices[0];
        for(int i=1; i<n; i++)
        {
            if(prices[i] >bestbuy)
            {
                mp=Math.max(mp, prices[i]-bestbuy);
            }
            bestbuy=Math.min(bestbuy,prices[i]);
        }
        return mp;
        
    }
}