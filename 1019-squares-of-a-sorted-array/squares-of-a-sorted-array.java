class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]= new int[nums.length];
        int l=0;int h=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[l])>Math.abs(nums[h])){
            arr[i]=Math.abs(nums[l]*nums[l]);
            l++;
            }
            else{
                arr[i]=Math.abs(nums[h]*nums[h]);
                h--;
            }
        }
       
        return arr;
    }
}