class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
        int d=0;
        int k=3;
        for( int i=0;i<s.length()-k+1;i++){
            char c=s.charAt(l);
            char b=s.charAt(l+1);
            char a=s.charAt(l+2);
            if(a!=b&&b!=c&&c!=a){
                d++;
            }
            l++;
        }
    return d;
        
    }
}