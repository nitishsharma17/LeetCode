class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0) {
            return false;
        }

        int num = 1;
        while (num < n) {
            if (num > Integer.MAX_VALUE / 3) {
                return false;
            }
            num *= 3;
        }

        return num == n;
    }
}