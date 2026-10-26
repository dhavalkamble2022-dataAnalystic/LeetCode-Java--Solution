// class Solution {
//     public int mySqrt(int x) {
//         int low=0;
    
//         int high=x;
//         int ans=0;
//         while(low<=high)
//         {
//             int guess=(low+high)/2;
//             if(guess *guess==x)
//             return guess;
//             if(guess *guess<x)
//             {
//             ans=guess;
//             low=guess+1;
//             }
//             else
//             {
//             high=guess-1;
//             }
//         }
//         return ans;
//     }
// }


class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / (mid == 0 ? 1 : mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
