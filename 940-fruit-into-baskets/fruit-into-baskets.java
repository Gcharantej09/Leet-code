import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int l=0;
        for(int i=0;i<fruits.length;i++){
            int r=fruits[i];
                map.put(r, map.getOrDefault(r,0)+1);
            while(map.size()>2){
                int vall=fruits[l];
                map.put(vall,map.get(vall)-1);
            if(map.get(vall)==0){
                map.remove(vall);
            }
            l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}