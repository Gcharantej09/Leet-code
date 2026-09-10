import java.util.*;class Solution {
    public int countKDifference(int[] nums, int k) {
      int c=0;
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int m=nums[i]-k;
        if(map.containsKey(m)){
          c+=map.get(m);
        }
        int l=nums[i]+k;
        if(map.containsKey(l)){
          c+=map.get(l);
        }
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      return c;
    }
}