import java.util.*;class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>s=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            s.add(gifts[i]);
        }
        for( int i=0;i<k;i++){
            int t=s.poll();
            s.add((int)Math.sqrt(t));
        } 
        long ans=0;
        while(!s.isEmpty()){
            ans+=s.poll();
        }
        return ans;
    }    
}