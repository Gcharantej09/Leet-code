class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int h=s.length()-1;
        List<Character>c=new ArrayList<>();
       
        for( int i=0;i<s.length();i++){
            if((Character.isLetterOrDigit(s.charAt(i)))){
                c.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        List<Character>ans=new ArrayList<>();
        
        for(int i=c.size()-1;i>=0;i--){
            ans.add(c.get(i));
            
        }
        
        
        
        
        return c.equals(ans);
    }
}