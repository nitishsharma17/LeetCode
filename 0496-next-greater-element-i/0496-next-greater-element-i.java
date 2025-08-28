
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] res = new int[n];
        Map<Integer, Integer> value = new HashMap<>();

        res[n - 1] = -1;
        st.push(nums2[n - 1]);
        value.put(nums2[n - 1], -1);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            value.put(nums2[i], res[i]);
            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = value.get(nums1[i]);
        }

        return ans;
    }
}