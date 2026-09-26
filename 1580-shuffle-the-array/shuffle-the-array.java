class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int [nums.length-n];
        int arr2[]=new int [nums.length-n];
        for( int i=0;i<n;i++){
            arr1[i]=nums[i];
        }int j=0;
        for(int i=n;i<nums.length;i++){
            arr2[j]=nums[i];
            j++;

        }
        int arr3[]= new int [nums.length];
        int x=0;
        for(int i=0;i<nums.length-n;i++){
          arr3[x++]=arr1[i];
          arr3[x++]=arr2[i];
        }
        return arr3;
    }
}