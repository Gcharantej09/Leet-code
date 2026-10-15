import java.util.*;class Solution {
    public String reverseWords(String s) {
        String[]s1=s.split(" ");
      StringBuilder s3=new StringBuilder();
        for(int i=0;i<s1.length;i++){
          StringBuilder temp=new StringBuilder (s1[i]);
          s3.append(temp.reverse());
          if(i<s1.length-1){
            s3.append(" ");
          }
        }
        return s3.toString();
    }
}