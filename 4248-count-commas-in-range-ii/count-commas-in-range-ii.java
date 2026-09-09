class Solution {
    public long countCommas(long n) {
        long c=0;
       if(n<1000){
        return 0;
       }
        if(n>=1000 ){
            c+= (n-1000)+1;}
        
        if(n>=Math.pow(10,6) ){
            c+= ((n-Math.pow(10,6))+1);}
        if(n>=Math.pow(10,9)){
            c+=((n-Math.pow(10,9))+1);

        }
        if(n>=(long)Math.pow(10,12)){
            c+=((n-(long)Math.pow(10,12))+1);
        }
        if(n>=(long)Math.pow(10,15)){
            c+=n-(long)Math.pow(10,15)+1;
        }
        return c;
        
    }
}