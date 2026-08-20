class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int [nums.length];
        int arr2[]=new int [nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int j=0;
        int k=0;
        int nums1[]=new int[nums.length];
        for(int i=2;i<nums.length;i++){
            if(arr1[j]>arr2[k]){
                arr1[j+1]=nums[i];
                j++;
            }
           else{
                arr2[k+1]=nums[i];
                k++;
            }
        }
       
        for(int i=0;i<=j;i++){
            nums1[i]=arr1[i];
        
        }
         for(int i=0;i<=k;i++){
            nums1[j+i+1]=arr2[i];

        }
        return nums1;
    }
}