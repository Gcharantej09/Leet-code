class Solution {
    public static boolean ispossible(int []piles, int k, int h){
        for( int i=0;i<piles.length;i++){
            int temp=piles[i]/k;
           
            if(piles[i]%k!=0){
                temp++;
            }
             h-=temp;
            if(h<0){
                return false;
            }

        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(piles,mid,h)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}                           