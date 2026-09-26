class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0;
        int y=n;
        int arr[]= new int [2*n];
        int i=0;
        while(x<n){
            arr[i++]=nums[x++];
            arr[i++]=nums[y++];
        }
        return arr;
    }
}