class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int ans=Integer.MAX_VALUE;
         int temp=0;
        for( int i=0;i<nums.length;i++){
            temp+=nums[i];
            while(temp>= target){
                  ans=Math.min(ans,i-l+1 );
                temp-=nums[l];
              
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}