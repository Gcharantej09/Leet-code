class Solution {
    public String clearDigits(String s) {
        StringBuilder s1=new StringBuilder();
        for( int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                s1.append(c);
            }
            else if(c>='0'&&c<='9'){
                s1.deleteCharAt(s1.length()-1);
            }
        }
        return s1.toString();
    }
}