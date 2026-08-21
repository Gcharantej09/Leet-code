class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      
        int l=0;int c=0;
        int ans=0;
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
        l=0;c=0;
         for( int i=0;i<answerKey.length();i++){
            if(answerKey.charAt(i)=='T'){
                c++;
            }
            while(c>k){
            if(answerKey.charAt(l)=='T'){
                c--;
            }
                l++;
            }
            ans=Math.max(ans, i-l+1);
        }
        return ans;
    }
}