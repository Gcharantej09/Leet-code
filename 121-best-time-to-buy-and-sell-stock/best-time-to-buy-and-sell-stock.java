class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int a=prices[0];
        for( int i=0;i<prices.length;i++){
           a=Math.min(a,prices[i]);
           int b=prices[i]-a;
           ans=Math.max(ans, b);
        }
        return ans;
    }
}