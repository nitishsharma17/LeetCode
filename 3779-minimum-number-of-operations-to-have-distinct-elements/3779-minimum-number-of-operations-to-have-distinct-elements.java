class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = n-1; i>=0; i--){
            if(!set.add(nums[i])){
                return i / 3 + 1;
            }
        }
        return 0;
    }
}