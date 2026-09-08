class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000){
            return 0;
        }
         if(n>999){
        for( int i=999;i<n;i++){
            c++;
        }}
           
        return c;
    }
}