class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];

        }
        Arrays.sort(nums);
        long ans=0;
        long ans1=0;
        for(int i=0;i<n/2;i++){
            ans+=nums[i];
        }
        for( int i=n/2;i<n;i++){
            ans1+=nums[i];
        }
        return (long)ans1-ans;
    }
}