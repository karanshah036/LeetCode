// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int bought=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            if(bought>=prices[i]) bought=prices[i];
            else{
                profit=Math.max(prices[i]-bought,profit);
            }
        }
        return profit;
    }
}