class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        int max[]=new int [n];
        int min[]=new int [n];
        max[n-1]=nums[n-1];
        for( int i=n-2;i>=0;i--){
            max[i]=Math.min(nums[i],max[i+1]);
        }min[0]=nums[0];
        for( int i=1;i<nums.length;i++){
            min[i]=Math.max(min[i-1], nums[i]);
            
        }
        for( int i=0;i<nums.length;i++){
            if( min[i]-max[i]<=k){
                return i;
            }
        }
        return -1;
    }
}