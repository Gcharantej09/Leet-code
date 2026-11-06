class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character>s=new ArrayList<>();
        List<Character>s1=new ArrayList<>();
        int row=word1.length;
        
        for( int i=0;i<row;i++){
            for(int j=0;j<word1[i].length();j++){
                s.add(word1[i].charAt(j));
            }
        }
        int row1=word2.length;
  
         for( int i=0;i<row1;i++){
            for(int j=0;j<word2[i].length();j++){
                s1.add(word2[i].charAt(j));
            }
        }
        if(s.size()!=s1.size()){
            return false;
        }
        return s.equals(s1);
    }
}