import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int ans=Integer.MAX_VALUE;
       int l=0;
        for( int i=0;i<nums.length;i++){
            int temp=0;
            if(i-l+1==k){
                temp=nums[i]-nums[l];
                l++;
                ans=Math.min(ans,temp);
            }
            
        }return ans;
    }
}