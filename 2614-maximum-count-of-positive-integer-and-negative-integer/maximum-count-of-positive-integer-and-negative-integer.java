class Solution {
    public int maximumCount(int[] nums) {
        int temp=0;int temp1=0;int ans=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]<0){
                temp++;
            }
            if( nums[i]>0){
                temp1++;
            }
        }
        ans= Math.max(temp,temp1);
        return ans;

    }
}