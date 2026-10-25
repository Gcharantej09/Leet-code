class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0)return;
        k=k%nums.length;
        int []s=new int [nums.length];
        int l=nums.length-k;
        int j=0;
        for(int i=l;i<nums.length;i++){
            s[j]=nums[i];j++;
        }
        
        for(int i=0;i<l;i++){
            s[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=s[i];
        }
        
    }
}