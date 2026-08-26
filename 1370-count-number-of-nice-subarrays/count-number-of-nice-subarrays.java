class Solution {
    public  int numberOfSubarrays(int nums[],int k){
        return  final1(nums,k) -final1(nums,k-1);
    }
    public  int  final1(int[] nums, int k) {
        int l=0;int ans=0;
        int temp=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]%2==1){
                    temp--;
                }
                l++;
            }
           ans+=i-l+1;
        }
        return ans;
    }
}