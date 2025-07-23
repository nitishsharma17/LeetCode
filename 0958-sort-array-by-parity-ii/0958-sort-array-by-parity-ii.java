class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ep = 0;
        int op = 1;
        int  n = nums.length;
      
      while(ep<n&&op<n){
            if(nums[ep]%2 == 0){
                ep +=2; 
            }
            else if (nums[op]%2 != 0){
                op +=2;
            }
            else{
                int t = nums[ep];
                nums[ep] = nums[op];
                nums[op] = t;

                ep += 2;
                op += 2;
            }
      }
      return nums;
    }
}