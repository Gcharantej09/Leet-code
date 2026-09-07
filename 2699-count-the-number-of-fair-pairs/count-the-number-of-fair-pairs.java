import java.util.*;class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return fun(nums,upper+1)-fun(nums,lower);
    }
    public long fun(int []nums, int t){
        int l=0;int h=nums.length-1;long sum=0;
        while(l<=h){
            int k=nums[l]+nums[h];
            if(k<t){
                sum+=(h-l);
                l++;
            }
            else{
                h--;
            }
        }
        return sum;
    }

}