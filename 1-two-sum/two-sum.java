class Solution {
    public int[] twoSum(int[] nums, int target) {
     int k=nums.length;
      HashMap<Integer,Integer>set= new HashMap<>();
      for(int i=0;i<k;i++){
        int l=target-nums[i];
        if( set.containsKey(l)){
            return new int []{set.get(l),i};
        }
        set.put(nums[i],i);
      }
      return new int[]{};
    }
}