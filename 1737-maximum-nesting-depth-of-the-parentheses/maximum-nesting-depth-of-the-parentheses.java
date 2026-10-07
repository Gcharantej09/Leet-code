class Solution {
    public int maxDepth(String s) {
        Stack<Character>s1=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                s1.push(c);
            }
            else if(c==')'){
                s1.pop();
            }
            ans=Math.max(ans,s1.size());
        }
        return ans;
    }
}