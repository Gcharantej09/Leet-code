class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=-Float.MAX_VALUE;
        int l=0;
        double temp=0;
        double div=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
           
            if(i-l==k){
               temp-=nums[l];
                l++;
            }
            if(i-l+1==k){
                 div=temp/k;
                ans=Math.max(ans,div);
            }
        }
        return ans;
    }
}