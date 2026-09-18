class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for( int j=0;j<matrix[0].length;j++){
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                if( matrix[i][j]>mx){
                    mx=matrix[i][j];
                }
            }
            for(int i=0;i<matrix.length;i++){
                if( matrix[i][j]==-1){
                    matrix[i][j]=mx;
                }
            }
        }
        return matrix;
    }
}