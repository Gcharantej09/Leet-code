class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans=0;
        int l=0;int c=0;
        for( int i=0;i<answerKey.length();i++){
            if(answerKey.charAt(i)=='F'){
                c++;
            }
            while(c>k){
            if(answerKey.charAt(l)=='F'){
                c--;
            }
                l++;
            }
            ans=Math.max(ans, i-l+1);
        }
        int t=0;
        int s=0;
         for( int i=0;i<answerKey.length();i++){
            if(answerKey.charAt(i)=='T'){
                t++;
            }
            while(t>k){
            if(answerKey.charAt(s)=='T'){
                t--;
            }
                s++;
            }
            ans=Math.max(ans, i-s+1);
        }
        return ans;
    }
}