class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        int k=3;
        
        for( int i=0;i<=s.length()-k;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<i+k;j++){
            set.add(s.charAt(j));
            if(set.size()==k){
                ans++;
            }
        }}
        return ans;
    }
}