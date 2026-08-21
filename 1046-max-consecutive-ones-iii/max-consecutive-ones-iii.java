class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int ans=0;
        int l=0;

        for( int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }return ans;
    }
}