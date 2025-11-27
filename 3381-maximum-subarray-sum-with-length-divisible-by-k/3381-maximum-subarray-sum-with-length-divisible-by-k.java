class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        long[] min = new long[k];
        Arrays.fill(min, Long.MAX_VALUE);
        long ans = Long.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int rem = i % k;
            if (min[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix[i] - min[rem]);
            }
            min[rem] = Math.min(min[rem], prefix[i]);
        }
        return ans;
    }
}
