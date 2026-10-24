class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        int res = high;

        while (low <= high) {
            int guess = low + (high - low) / 2;

            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + (long) guess - 1) / guess;
            }

            if (hours <= h) {
                res = guess;
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }

        return res;
    }
}