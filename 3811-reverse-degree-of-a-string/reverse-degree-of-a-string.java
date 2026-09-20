class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for( int i=0;i<s.length();i++){
            int rem='z'-s.charAt(i)+1;
            ans +=rem *(i+1);

        }
        return ans;
    }
}