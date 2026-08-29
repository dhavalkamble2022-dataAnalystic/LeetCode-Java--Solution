import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> f = new HashMap<>();

        int ans = 0;
        int sum = 0;

        // Initially remainder 0 occurs once
        f.put(0, 1);

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (rem < 0) {
                rem = rem + k;
            }

            if (f.containsKey(rem)) {
                ans += f.get(rem);
            }

            f.put(rem, f.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}