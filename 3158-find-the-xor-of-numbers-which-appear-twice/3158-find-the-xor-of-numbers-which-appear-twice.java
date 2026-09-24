class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int xor = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                xor = xor ^ num;
            } else {
                set.add(num);
            }
        }

        return xor;
    }
}