class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long t = 0;
        for (int num : nums) {
            t += num;
        }
        int res = (int)(t % p);
        if (res == 0) return 0;
        int count = n;
        long prefix = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for (int i = 0; i < n; i++) {
            prefix = (prefix + nums[i]) % p;
            int a = (int)((prefix - res + p) % p);
            if (mp.containsKey(a)) {
                count = Math.min(count, i - mp.get(a));
            }
            mp.put((int)prefix, i);
        }
        return count == n ? -1 : count;
    }
}
