class Solution {
    public int[] singleNumber(int[] nums) {
        final int xors = Arrays.stream(nums).reduce(0,(a,b) ->a^b);
        final int lx = xors & - xors;
        int[] ans = new int[2];

    for(int num : nums){
        if((num & lx) == 0){
            ans[0]^=num;
        }else{
            ans[1]^=num;
        }
    }
    return ans;
    }
}