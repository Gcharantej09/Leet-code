class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
              l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return h;
    }
}