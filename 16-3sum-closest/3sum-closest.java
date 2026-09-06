class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort( nums);
        int ans=nums[0]+nums[1]+nums[2]; 
        for ( int i=0;i<nums.length-2;i++){
        
            int right=nums.length-1;
            int left=i+1;
            while(left<right){
            int temp=nums[i]+nums[left]+nums[right];
            if(Math.abs(temp-target)<Math.abs(ans-target)){
                ans=temp;
            }
            if(temp<target){
                left++;
            }
            else if(temp>target){
                right--;
            }
            else{
                return temp;
            }
            }
            
        }
        return ans;
    }
}