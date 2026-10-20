class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int low = 0;
        int n = letters.length;
        int high = n - 1;

        while (low <= high) {
            int guess = (low + high) / 2;

            // if (letters[guess] == target)
            //     return letters[guess];

            if (letters[guess] > target)
             high = guess - 1;
            else
             low = guess + 1;
        }

          return letters[low%n];
    }
}