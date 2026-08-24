import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numrows) {
        List<List<Integer>>ans=new ArrayList<>();
      
        
        for(int j=0;j<numrows;j++){
             List <Integer>temp=new ArrayList<>();
        temp.add(1);

        for(int i=1;i<j;i++){
            int val=ans.get(j-1).get(i-1)+ans.get(j-1).get(i);
            temp.add(val);
        }
        if(j>0){
        temp.add(1);
        }
         ans.add(temp);
        }
        return ans;
    }
}