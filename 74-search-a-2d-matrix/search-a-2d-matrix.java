class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row=matrix.length;int col=matrix[0].length;
        int l=0;
        int h=row*col-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int  r=mid/col;
             int c=mid%col;
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }return false;
    }
}