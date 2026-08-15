class Solution {
    public int[] twoSum(int[] nums, int target) {
     
      for(int n=0;n<nums.length;n++){
        for(int m=n+1;m<nums.length;m++){
            if(nums[n]+nums[m]==target){
                return new int []{n,m};
            }
        }
      }return new int[]{};
    }
}