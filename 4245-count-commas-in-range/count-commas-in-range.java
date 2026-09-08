class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000){
            return 0;
        }
        for( int i=1000;i<=n;i++){
            if(n>999){
                 c++;
            }
        }
        return c;
    }
}