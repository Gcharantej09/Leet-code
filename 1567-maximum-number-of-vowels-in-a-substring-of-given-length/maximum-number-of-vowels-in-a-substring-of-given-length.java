class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>set=new HashSet<>();
        StringBuilder s1=new StringBuilder();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int c=0;
        int ans=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                c++;
            }
            if(i-l+1>k){
                if(set.contains(s.charAt(l))){
                    c--;
                }
                l++;
            }
            if(i-l+1==k){
                ans=Math.max(ans,c);

            }
        }
        return ans;
    }
}