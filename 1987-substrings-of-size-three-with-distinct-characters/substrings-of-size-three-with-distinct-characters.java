class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character>set=new HashSet<>();
        int l=0;int ans=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            
                set.add(s.charAt(i));
                if(i-l+1>3){
                    set.remove(s.charAt(l));
                    l++; 
                }
                if(i-l+1==3){
                    ans++;
                }
            
            
            
        }
        return ans;
    }
}