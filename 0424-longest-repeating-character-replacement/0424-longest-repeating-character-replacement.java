import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> f = new HashMap<>();

        int low = 0;
        int res = 0;
        int maxint = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            f.put(ch, f.getOrDefault(ch, 0) + 1);

            maxint = Math.max(maxint, f.get(ch));

            int len = high - low + 1;
            int diff = len - maxint;

            while (diff > k) {

                char left = s.charAt(low);

                f.put(left, f.get(left) - 1);

                low++;

                len = high - low + 1;
                diff = len - maxint;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;     }
}