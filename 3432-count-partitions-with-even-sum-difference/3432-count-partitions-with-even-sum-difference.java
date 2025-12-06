class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int i =0; i<n; i++){
           total += nums[i];
        } 
 
        int left = 0;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            left += nums[i];
            int right = total - left;
            if ((left % 2) ==(right % 2)) {
                count++;
            }
        }
        return count;
    }
}
