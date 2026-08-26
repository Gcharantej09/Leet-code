class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return mass(nums,k)-mass(nums,k-1);
    }
    public int mass(int []nums,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;int temp=0;int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1){
                temp++;
            }
            while(temp>k){
                map.put(nums[l],map.get(nums[l])-1);
                
                if(map.get(nums[l])==0){
                map.remove(nums[l]);
                temp--;
                }
                l++;
            }
            ans+=i-l+1;
        }return ans;
    }
}