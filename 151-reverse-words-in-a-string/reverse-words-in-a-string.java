class Solution {
    public String reverseWords(String s) {
        String []s2=s.trim().split("\\s+");
        StringBuilder s1=new StringBuilder();
        for( int i=s2.length-1;i>=0;i--){
            s1.append(s2[i]);
            if(i>0){
            s1.append(" ");
            }

        }
        return s1.toString();
    }
}