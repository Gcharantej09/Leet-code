class Solution {
    public int  minMoves2(int [] nums) {
        long ans=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            long c=0;
            for( int j=0;j<nums.length;j++){
                if( nums[j]>nums[i]){
                    c=c+((long)nums[j]-nums[i]);    
                }
                else if(nums[j]<nums[i]){
                    c=c+((long)nums[i]-nums[j]);    
                }      
            }
             ans= Math.min(ans, c);    
        }
        return (int)ans;
    }
}