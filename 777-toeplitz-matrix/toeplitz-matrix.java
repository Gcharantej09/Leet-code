class Solution {
    public boolean isreal(int [][]matrix,int i,int j){
        int r=matrix.length;
        int c=matrix[0].length;
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
        for(int i=0;i<matrix.length;i++){
            boolean temp=isreal(matrix,i,0);
            if(temp==false){
                ans=false;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            boolean temp1=isreal(matrix,0,i);
            if(temp1==false){
                ans=false;
            }
        }
        return ans;
        
        
    }
}