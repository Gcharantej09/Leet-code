class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int h=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            int c=0;
            if(m.containsKey(nums[i])){
               return true;
            }
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
     
        return false;
       
    }
}