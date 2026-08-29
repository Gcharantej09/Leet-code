class Solution {
    public int maximumCount(int[] nums) {
        int neg=fun(nums,0);
        int one=fun(nums,1);
        int pso=nums.length-one;
        int ans=Math.max(neg,pso);
        return ans;
     }
     public static int fun(int []nums,int k){ 
        int l=0;int h=nums.length-1;
        while( l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=k){
                 h=mid-1; 
            }
            else{
              l=mid+1;
            }
            
        }return l;
     }

}