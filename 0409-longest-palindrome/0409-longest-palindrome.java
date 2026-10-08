class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> f = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        for (int val : f.values()) {

            if (val % 2 == 0) {
                res += val;
            } else {
                res += val - 1;
                odd = true;
            }
        }

        if (odd == true) {
            res++;
        }

        return res;
    }
}