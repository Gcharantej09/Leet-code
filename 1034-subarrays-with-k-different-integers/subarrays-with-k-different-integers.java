class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {

        int[] freq = new int[nums.length + 1];

        int l = 0;
        int distinct = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {

            if (freq[nums[r]] == 0) {
                distinct++;
            }

            freq[nums[r]]++;

            while (distinct > k) {

                freq[nums[l]]--;

                if (freq[nums[l]] == 0) {
                    distinct--;
                }

                l++;
            }

            ans += r - l + 1;
        }

        return ans;
    }
}