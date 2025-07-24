class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int i =0;
        for(int nums : nums1){
            set1.add(nums);
        }
        for(int nums : nums2){
            if(set1.contains(nums)){
                set2.add(nums);
            }
        }
        int [] arr = new int[set2.size()];
        int j = 0;

        for(int nums : set2){
            arr[j++] = nums;
        }
        return arr;
    }
}