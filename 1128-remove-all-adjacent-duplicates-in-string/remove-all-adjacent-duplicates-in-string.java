class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s1.size()>0 && s1.peek()==c){
                s1.pop();
            }
            else{
             s1.push(c);
            }
        }
        String s2="";
        for(int i=0;i<s1.size();i++){
            s2+=s1.get(i);
        }
        return s2;
    }
}