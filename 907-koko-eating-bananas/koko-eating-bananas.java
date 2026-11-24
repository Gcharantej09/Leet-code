class Solution {
    static boolean istrue(int piles[],int h,int k){
        for( int i=0;i<piles.length;i++){
            int rem=piles[i]/k;
            if(piles[i]%k!=0){
                rem++;
            }
            h-=rem;
            
            if(h<0){
                return false;
            }
            
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for( int i=0;i<piles.length;i++){
            r=Math.max(piles[i],r);
        }
        while(l<=r){
          int mid=l+(r-l)/2;
          if(istrue(piles,h,mid)){
            r=mid-1;
          }
          else{
            l=mid+1;
          }
        }
        return l;
    }
}                           