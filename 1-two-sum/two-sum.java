import java.util.*;class Solution {
    public int[] twoSum(int[] nums, int target) {
      
    HashMap<Integer,Integer>s=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        
        int a=target-nums[i];
        if(s.containsKey(a)&& s.get(a)!=i){
            return new int[]{s.get(a),i};
            
        } s.put(nums[i],i);     
        }
    return new int[]{};
    }
}