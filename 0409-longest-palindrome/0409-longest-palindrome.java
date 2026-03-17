class Solution {
    public int longestPalindrome(String s) {
        int[] ans = new int[128];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ans[s.charAt(i)]++;
        }
        int length = 0;
        boolean notpalindrome = false;
        for (int freq : ans) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1;
                notpalindrome = true;
            }
        }
        if (notpalindrome) length++;
        return length;
    }
}