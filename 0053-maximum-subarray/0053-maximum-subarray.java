class Solution {
    public int maxSubArray(int[] nums) {
        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(high=0; high<n; high++)
        {
            sum+=nums[high];
             res=Math.max(res,sum);
            if(sum<0)
            {
                sum=0;  
            }
        
        }
        return res;
    }
}