import java.util.Arrays;;
class Solution {
    public int majorityElement(int[] nums) {
        int n=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
           
            if(j==0){
                n=nums[i];
            }
                if(nums[i]==n){
                    j++;
                }
                else{
               j--;
            }
            

        }
       
        return n;
    }
}