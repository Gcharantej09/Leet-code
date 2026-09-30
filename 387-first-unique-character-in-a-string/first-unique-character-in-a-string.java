class Solution {
    public int firstUniqChar(String s) {
    for(int i=0;i<s.length();i++){
        boolean s1=true;
        for(int j=0;j<s.length();j++){
            if(i!=j &&s.charAt(i)==s.charAt(j)){
                s1=false;
                break;
            }
    
            

        }
        if(s1){
                return i;
            
            }

        
    }
    return -1;
    }
}