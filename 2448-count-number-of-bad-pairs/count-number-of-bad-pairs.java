class Solution {
    public long countBadPairs(int[] nums) {
        long c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0;i<nums.length;i++){
            int k=nums[i]-i;
            if(map.containsKey(k)){
                c+=map.get(k);
            }
            map.put(k,map.getOrDefault(k,0)+1);
        }
        long l=(long)nums.length*(nums.length-1)/2;
        return l-c;
    }
}