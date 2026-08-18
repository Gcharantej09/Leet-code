class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
  
        for( int i=0;i<nums.length;i++){
          if(i%3!=nums.length%3){
            temp+=nums[i];
          }
            
        }
        return temp;
    }
}