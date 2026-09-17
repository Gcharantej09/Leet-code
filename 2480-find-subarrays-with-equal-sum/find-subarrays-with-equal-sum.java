class Solution {
    public boolean findSubarrays(int[] nums) {
        int sum[]=new int[nums.length-1];
        int j=0;
        for(int i=1;i<nums.length;i++ ){
             sum[j]=nums[i-1]+nums[i];
                j++;
        }
        for( int i=0;i<sum.length;i++){
            for(int k=i+1;k<sum.length;k++){
                if(sum[i]==sum[k]){
                    return true;
                }
            }
            
        }
        return false;
    }
}