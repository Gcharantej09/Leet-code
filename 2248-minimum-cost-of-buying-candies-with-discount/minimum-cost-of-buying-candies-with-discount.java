class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        int l=0;
        for( int i=nums.length-1;i>=0;i--){
          
            if(l==2){
                l=0;
            }
            else{
                temp+=nums[i];
                l++;
            }
        }
        return temp;
    }
}