class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             int s=0;
            int n=nums[i];
            while(n>0){
                int rem=n%10;
                 s=s+rem;
                 n=n/10;
                
            }
            ans=Math.min(ans,s);
            
           
        }
        return ans;
    }
}