class Solution {
    public int findMiddleIndex(int[] nums) {
       
            for(int mid=0;mid<nums.length;mid++){
            int ans=0;
            int ans1=0;
            for(int i=0;i<=mid-1;i++){
                ans+=nums[i];
            }
            for(int i=mid+1;i<nums.length;i++){
                ans1+=nums[i];
            }
            if(ans==ans1){
                return mid;
            }
        }
        return -1;
    }
}