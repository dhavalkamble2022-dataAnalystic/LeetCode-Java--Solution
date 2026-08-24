class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int bestEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {

            int val1 = bestEnding + nums[i];
            int val2 = nums[i];

            bestEnding = Math.max(val1, val2);

            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }
}