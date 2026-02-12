class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        long max = 0;
        long prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            long conversion = nums[i] + max;
            prefixSum += conversion;
            ans[i] = prefixSum;
        }
        return ans;
    }
}
