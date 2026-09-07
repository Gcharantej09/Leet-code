class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l=0;
        for( int i=0;i<nums.size();i++){
            for( int j=i+1;j<nums.size();j++){
                int k=nums.get(i)+nums.get(j);
                if(k<target){
                    l++;
                }
            }

        }
        return l;
    }
}