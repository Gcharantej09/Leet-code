class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0;
        int y=n;
        int arr[]= new int [2*n];
        int j=0;
        for(int i=0;i<nums.length-n;i++){
            arr[j++]=nums[x];
            arr[j++]=nums[y];
            x++;y++;
           
        }
        return arr;
    }
}