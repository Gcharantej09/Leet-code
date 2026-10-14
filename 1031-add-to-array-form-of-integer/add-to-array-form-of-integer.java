class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
       
        ArrayList<Integer>a=new ArrayList<>();
        int i=nums.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k=k+nums[i];
                i--;
            }
            a.add(k%10);
            k=k/10;
        }
        Collections.reverse(a);
        return a;
    }
}