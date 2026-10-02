class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>s=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for( int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            
        }
        for( int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                s.add(i);
            }
        }
       return s;
    }
}