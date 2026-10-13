class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer>c=new HashMap<>();
      for(int i=0;i<s.length();i++){
        c.put(s.charAt(i),c.getOrDefault(s.charAt(i),0)+1);
      }
      PriorityQueue<freq>qp=new PriorityQueue<>((a,b)->b.val-a.val);
      for(char i:c.keySet()){
        freq t=new freq(i,c.get(i));
        qp.add(t);
      }
      StringBuilder s1=new StringBuilder();
      while(!qp.isEmpty()){
        freq k=qp.poll();
        int l=k.val;
        for(int i=0;i<l;i++){
            s1.append(k.c1);
        }
      }
      return s1.toString();
    }
    static class freq{
        char c1;
        int val;
        freq(char c1,int val ){
            this.c1=c1;
            this.val=val;
        }
    }
}