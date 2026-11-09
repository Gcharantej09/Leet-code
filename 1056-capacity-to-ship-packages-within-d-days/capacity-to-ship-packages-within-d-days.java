class Solution {
    static  boolean finding(int[] weight,int days,int mid){
        int temp=0;
        for(int i=0;i<weight.length;i++){           
            int val=weight[i];
            if(val>mid){
                return false;
            }          
            if(temp+val>mid){
                days-=1;
                temp=0;
            }
            temp+=val;
            if(days<=0){
                return false;
            }   
        }
        return true;
    } 
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(finding(weights,days,mid)){
                  r=mid-1;

            }
            else{
             
                 l=mid+1;
            }
           
        }
         return l;
    }
}