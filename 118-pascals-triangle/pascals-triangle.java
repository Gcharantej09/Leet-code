import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numrows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>row=new ArrayList<>();
        row.add(1);
        ans.add(row);
        for( int i=1;i<numrows;i++){
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for( int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                temp.add(val);
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;

    }
}