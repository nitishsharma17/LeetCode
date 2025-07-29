class Solution {
    public double myPow(double x, int n) {
        if (x == 0.0) {
            if (n == 0) return 1.0;
            if (n > 0) return 0.0;
            return Double.POSITIVE_INFINITY;
        }

        long N = n;
        double ans = 1.0;

        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        while (N > 0) {
            if ((N % 2) == 1) {
                ans = ans * x;
            }
            x = x * x;
            N = N / 2;
        }

        return ans;
    }
}