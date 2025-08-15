class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0) {
            return false;
        }

        int num = 1;
        while (num < n) {
            if (num > Integer.MAX_VALUE / 4) {
                return false;
            }
            num *= 4;
        }

        return num == n;
    }
}