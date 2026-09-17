class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>map=new HashSet<>();
       
        int c=0;
        for(int i=0;i<digits.length;i++){
            for( int j=0;j<digits.length;j++){
                for( int k=0;k<digits.length;k++){
                if(i!=j&&j!=k&&i!=k){
                    if(digits[i]==0){
                        continue;
                    }
                    if(digits[k]%2!=0){
                        continue;
                    }
                    int n=digits[i]*100+digits[j]*10+digits[k];
                
               if( !map.contains(n) ){
                c++;
                map.add(n);
               }
               } 
            }  
          }
        }
        return c;
    }
}