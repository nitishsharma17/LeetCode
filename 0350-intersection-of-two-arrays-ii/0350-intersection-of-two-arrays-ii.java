class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> is = new ArrayList<>();
        int i = 0;
        int j =0; 
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                is.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[is.size()];
        for(int x = 0; x<is.size();x++){
            arr[x] = is.get(x);
        }
        return arr;
    }

}