class Solution {
    public boolean findSubarrays(int[] nums) {
         HashSet<Integer>map=new HashSet<>();
         for(int i=0;i<nums.length-1;i++){
            int sum=(nums[i]+nums[i+1]);
            if(map.contains(sum)){
                return true;
            }
            map.add(sum);
         }
         return false;
    }
}