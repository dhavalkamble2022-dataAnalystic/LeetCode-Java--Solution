import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {

        Stack<Character> se = new Stack<>();

        // Push all characters
        for (int i = 0; i < s.length; i++) {
            se.push(s[i]);
        }

        // Pop and put back into array
        int i = 0;

        while (!se.isEmpty()) {
            s[i] = se.pop();
            i++;
        }
    }
}