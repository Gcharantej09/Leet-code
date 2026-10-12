class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>qp=new PriorityQueue<>();
        for( int i=0;i<nums.length;i++){
            qp.add(nums[i]);
        }
        int n=nums.length;
        int a[]=new int[n/2];
         int b[]=new int[n/2];
        for(int i=0;i<n/2;i++){
            a[i]=qp.poll();
            b[i]=qp.poll();
        }
        int nums1[]=new int[n];
        int j=0;
        int k=1;
        for( int i=0;i<n/2;i++){
            nums1[k]=a[i];
            k=k+2;
            nums1[j]=b[i];
            j=j+2;
        }
        return nums1;
    }
}