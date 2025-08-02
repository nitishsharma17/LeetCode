class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int m = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int e = -1;
        int s = -1;

        for(int i =0;i<n;i++){
            if(nums[i]<m){
                e = i;
            }else{
                m=nums[i];
            }
        }
        for(int i = n-1;i>=0;i--){
            if(nums[i]>min){
                s=i;
            }else{
                min=nums[i];
            }
        }
        return s == e?0:e-s+1; 
    }
}