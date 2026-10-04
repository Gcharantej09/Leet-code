class Solution {
    public boolean isreal(int [][]matrix,int y,int x){
        int r=matrix.length;
        int c=matrix[0].length;
        int i=y;
        int j=x;
        int temp=matrix[i][j];
        boolean valid=true;
        while(i<r&&j<c){
            if(matrix[i][j]!=temp){
                valid= false;
               
                
            } 
             i++;j++; 
            
        }
        return valid;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans=true;
         int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            boolean temp=isreal(matrix,i,0);
            if(temp==false){
                ans=false;
            }
        }
        for(int i=0;i<c;i++){
            boolean temp1=isreal(matrix,0,i);
            if(temp1==false){
                ans=false;
            }
        }
        return ans;
        
        
    }
}