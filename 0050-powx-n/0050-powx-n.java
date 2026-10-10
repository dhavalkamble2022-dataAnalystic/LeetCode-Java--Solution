
// class Solution {
//     public double myPow(double x, int n) {
//         long binform = n;
//         double ans = 1.0;

//         if (binform < 0) {
//             x = 1.0 / x;
//             binform = -binform;
//         }

//         while (binform > 0) {
//             if ((binform & 1) == 1) {
//                 ans *= x;
//             }

//             x *= x;
//             binform >>= 1;
//         }

//         return ans;
//     }
// }


class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        boolean negative = exp < 0;

        if (negative) {
            exp = -exp;
        }

        double ans = 1.0;
        double base = x;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= base;
            }

            exp >>= 1;

            if (exp > 0) {
                base *= base;
            }
        }

        if (negative) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}

