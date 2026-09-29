class Solution {
    public boolean canAliceWin(int[] nums) {
        int c=0;
        int c1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                c+=nums[i];
            }
            if(nums[i]>=10){
                c1+=nums[i];
            }
        }
        return c!=c1;

    }
}