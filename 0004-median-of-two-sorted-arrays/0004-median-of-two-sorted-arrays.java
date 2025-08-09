class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int tl = n + m;
        int i = 0;
        int j =0;
        int m1=0;
        int m2 = 0;

        for(int c = 0; c <=tl/2;c++){
            m2=m1;

            if(i<m&&(j>=m || nums1[i] < nums2[j])){
                m1 = nums1[i];
                i++;
            }else{
                m1 = nums2[j];
                j++;
            }
        }
        if(tl%2==1){
            return (double) m1;
        }else{
            return ((double) m1 + (double)m2) / 2.0;
        }
    }
}