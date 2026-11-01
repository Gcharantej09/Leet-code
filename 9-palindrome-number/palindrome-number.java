class Solution {
    public boolean isPalindrome(int x) {
        int z=x;
        int y=0;
        if(x<0)return false;
        while(x>0){
            int rem=x%10;
            y=y*10+rem;
            x=x/10;
        }
        
        return y==z;
    }
}