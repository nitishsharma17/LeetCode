class Solution {
    public int largestInteger(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 == nums[j] % 2 && nums[i] < nums[j]) {
                    char temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(nums));
    }
}