class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int l=0;int h=nums.length-k;
        while(l<h){
            int mid=l+(h-l)/2;
            if(x-nums[mid]>nums[mid+k]-x){
                l=mid+1;
            }
            else{
                h=mid;
            }

        }
        List<Integer>list=new ArrayList<>();
        for(int i=l;i<l+k;i++){
            list.add(nums[i]);
        }
        return list;
    }
}