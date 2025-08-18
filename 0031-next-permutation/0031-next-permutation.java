class Solution {
    private void reverse(int[] nums , int i , int j ){
        while(i<=j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int j = n-2;
        while( j>=0 && nums[j]>=nums[j+1] ){
            j--;
        }
        if(j >=0){
            int i = n-1;
            while(nums[j]>=nums[i]){
                i--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        

        reverse(nums,j+1 , n-1);
        System.gc();
    }
}