class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int h=0;
        for( int i=0;i<nums.length;i++){
            h=Math.max(h,nums[i]);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            int temp=0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=(nums[i]+mid-1)/mid;
                temp+=sum;
            }
            if(temp<=threshold){
                
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}