class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean>arr=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int ans=candies[i]+extraCandies;
            if(ans>=max){
                 arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}