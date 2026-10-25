class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
        int []s=new int [nums.length];
        
        for(int i=0;i<nums.length;i++){
            s[(i+k)%nums.length]=nums[i];
        }
        
        
        for(int i=0;i<nums.length;i++){
            nums[i]=s[i];
        }
        
    }
}