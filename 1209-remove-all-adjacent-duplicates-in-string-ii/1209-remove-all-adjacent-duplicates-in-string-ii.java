import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {

        int n = s.length();

        Stack<Pair> st = new Stack<>();

        // Process each character
        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            // Stack is empty
            if (st.isEmpty()) {
                st.push(new Pair(c, 1));
                continue;
            }

            // Top character is different
            if (st.peek().ch != c) {
                st.push(new Pair(c, 1));
                continue;
            }

            // Same character and count becomes k
            if (st.peek().count == k - 1) {
                st.pop();
                continue;
            }

            // Same character, increase count
            Pair p = st.peek();
            st.pop();

            st.push(new Pair(p.ch, p.count + 1));
        }

        // Build answer
        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {

            Pair p = st.peek();
            st.pop();

            while (p.count-- > 0) {
                res.append(p.ch);
            }
        }

        return res.reverse().toString();
    }

    // Pair class
    class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}