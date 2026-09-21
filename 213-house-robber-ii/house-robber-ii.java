class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int ans = 0;
        int prev = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int temp = ans;
            ans = Math.max(ans, prev + nums[i]);
            prev = temp;
        }
        int bns = 0;
        prev = 0;
        for(int i = 1; i < nums.length; i++) {
            int temp = bns;
            bns = Math.max(bns, prev + nums[i]);
            prev = temp;
        }
        return Math.max(ans, bns);
    }
}