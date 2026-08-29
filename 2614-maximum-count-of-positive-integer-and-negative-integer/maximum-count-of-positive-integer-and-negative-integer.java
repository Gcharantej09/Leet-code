class Solution {
    public int maximumCount(int[] nums) {
        int l=0;int h=nums.length-1;int ans=0;
        while( l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=0){
                 h=mid-1; 
            }
            else{
              l=mid+1;
            }
            
        }
        int temp=h+1;
         l=0;h=nums.length-1;
        while( l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>0){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
            int temp1=nums.length-l;
            ans=Math.max(temp,temp1);
            return ans;
    }
}