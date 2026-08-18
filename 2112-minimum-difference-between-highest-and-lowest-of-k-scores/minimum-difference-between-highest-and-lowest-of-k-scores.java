import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int ans=Integer.MAX_VALUE;
        for( int i=0;i<=nums.length-k;i++){
            int temp=nums[i+k-1]-nums[i];
            ans=Math.min(ans,temp);
        }return ans;
    }
}