class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int ml = 1;
        int cl = 1;
        int n = nums.length;
        int[]dp = new int[n+1];

        for(int i =1; i<n; i++){
            if(dp[i-1] == 0){
                dp[i-1] = 1;
            }
            if(nums[i] == nums[i-1] +1){
                cl++;
            }
            else if(nums[i] != nums[i-1]){
                cl = 1;
            }
            dp[i] = cl;
            ml = Math.max(ml,cl);
        
        }
        return ml;
    }
}