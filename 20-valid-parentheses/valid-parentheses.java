import java.util.*;
class Solution {
    public boolean isValid(String s) {
       Stack<Character>s1=new Stack<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('||c=='['||c=='{'){
            s1.push(c);
        }
        else if(c==')'){
            if(s1.isEmpty()){
        return false;
       }
           char a= s1.peek();
           if(a=='('){
            s1.pop();
           }
           else{
            return false;
           }

        }
        else if(c==']'){
            if(s1.isEmpty()){
        return false;
       }
           char a= s1.peek();
           if(a=='['){
            s1.pop();
           }
           else{
            return false;
           }

        }
        else if(c=='}'){
            if(s1.isEmpty()){
        return false;
       }
           char a= s1.peek();
           if(a=='{'){
            s1.pop();
           }
           else{
            return false;
           }

        }
       }
       if(s1.isEmpty()){
        return true;
       }
       return false;
    }
}