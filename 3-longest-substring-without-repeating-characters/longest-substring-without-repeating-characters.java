class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans=0;
        HashSet<Character>set=new HashSet<>();
        for( int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{ 
                while(set.contains(ch)){
                    set.remove(s.charAt(l));
                    l++;

                }
                set.add(ch);
                }
                ans=Math.max(ans,i-l+1);
        }
        return ans;
        
    }
}