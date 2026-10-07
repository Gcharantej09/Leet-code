class Solution {
    public String clearDigits(String s) {
        Stack<Character>s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                s1.push(c);
            }
            else if(c>='0' &&c<='9'){
                s1.pop();
            }
        }
        String ans="";
        for(char i: s1){
            ans=ans+i;
        }
        return ans;
    }
}