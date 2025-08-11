class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int totalSum = 0;
        int max = nums[0];
        int min = nums[0];
        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {
            totalSum += num;
            
            currentMax += num;
            max = Math.max(max, currentMax);
            if (currentMax < 0) {
                currentMax = 0;
            }

            currentMin += num;
            min = Math.min(min, currentMin);
            if (currentMin > 0) {
                currentMin = 0;
            }
        }
        
        if (max < 0) {
            return max;
        }

        return Math.max(max, totalSum - min);
    }
}