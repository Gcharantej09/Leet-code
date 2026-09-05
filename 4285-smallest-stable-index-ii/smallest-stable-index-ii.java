class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        int max[]=new int [n];
        max[n-1]=nums[n-1];
        for( int i=n-2;i>=0;i--){
            max[i]=Math.min(nums[i],max[i+1]);
        }int min=nums[0];
        for( int i=0;i<nums.length;i++){
            min=Math.max(min, nums[i]);
            if( min-max[i]<=k){
                return i;
            }
        }
        return -1;
    }
}