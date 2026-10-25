class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0)return;
        k=k%nums.length;
        List<Integer>s=new ArrayList<>();
        int l=nums.length-k;
        for(int i=l;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<l;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
                nums[i]=s.get(i);
        }
    }
}