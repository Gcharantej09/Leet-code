class Solution {
    public boolean uniformArray(int[] nums1) {
        int e=0;
        int c=0;
        for( int i=0;i<nums1.length;i++){
            if( nums1[i]%2==0){
                e++;
            }
            else{
                c++;
            }

        }
        if(c==nums1.length&&e==nums1.length){
            return true;
        }
        return true;
    }
}