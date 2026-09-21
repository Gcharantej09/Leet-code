class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int temp=0;
        int prev1=0;
        int prev2=0;
        for( int i=0;i<nums.length-1;i++){
            temp=Math.max(prev1+nums[i],prev2);
            prev1=prev2;
            prev2=temp;

        }
        int temp1=0;
        int prev4=0;
        int prev3=0;
        for( int i=1;i<nums.length;i++){
            temp1=Math.max(prev4+nums[i],prev3);
            prev4=prev3;
            prev3=temp1;

        }
    
        
        return Math.max(prev2,prev3);
    }
}