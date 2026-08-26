class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        return mass(nums,k)-mass(nums,k-1);
    }
    public int mass(int nums[],int goal){
        if(goal<0){
            return 0;
        }
        int l=0;int ans=0;int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }
            while(temp>goal){
                    if(nums[l]==1){
                        temp--;
                    }
                    l++;
            }ans+=i-l+1;
        } return ans;
    }
}