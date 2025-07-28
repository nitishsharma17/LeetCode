class Solution {
    void helper(List<List<Integer>> l, int[] nums, int x, int i, int j) {
        while (i < j) {
            if ((nums[i] + nums[j]) < -x) {
                i++;
            } else if ((nums[i] + nums[j]) > -x) {
                j--;
            } else {
                l.add(Arrays.asList(x, nums[i], nums[j]));
                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }
                i++;
                j--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            helper(l, nums, x, i + 1, nums.length - 1);
        }
        return l;
    }
}




