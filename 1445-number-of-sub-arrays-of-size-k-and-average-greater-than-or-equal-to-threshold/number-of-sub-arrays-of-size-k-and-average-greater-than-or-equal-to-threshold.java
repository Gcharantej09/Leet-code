class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int c=0;
        int r=0;
        for( int i=0;i<arr.length;i++){
          r+=arr[i];
            if(i-l==k){
                  r-=arr[l];
                l++;
            }
            if(i-l+1==k){
                if(r/k>=threshold){
                    c++;
                }
            }
            
        }
        return c;
    }
}