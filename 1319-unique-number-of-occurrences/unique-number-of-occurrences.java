class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>s1=new HashMap<>();
        for( int i=0;i<arr.length;i++){
            s1.put(arr[i],s1.getOrDefault(arr[i],0)+1);
        }
        
       HashSet<Integer>s= new HashSet<>();
       for(int i:s1.values()){
        
        if(s.contains(i)){
            return false;
        }  s.add(i);
        
       }
       return true;
    }
}