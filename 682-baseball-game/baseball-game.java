import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String st= operations[i];
            if(st.equals("+")){
                int ts=s.pop();
                int ts1=s.peek();
                int ans=(ts)+(ts1);
                s.push(ts);
               
                s.push(ans);

            }
            else if(st.equals("D")){
                int ts=s.peek();
                int ans=(ts)*2;
                
                s.push(ans);
            }
            else if(st.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.valueOf(st));
            }
        }
        int ans=0;
        for(int i=0;i<s.size();i++){
           
             ans+=s.get(i);}
        
        return ans;
    }
}