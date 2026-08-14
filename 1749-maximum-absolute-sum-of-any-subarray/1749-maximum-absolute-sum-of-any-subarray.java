class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int positive = 0;
        int negative = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            
            positive = Math.max(0, positive + nums[i]);
            negative = Math.min(0, negative + nums[i]);

            res = Math.max(res, Math.max(positive, Math.abs(negative)));
        }

        return res;
    }
}