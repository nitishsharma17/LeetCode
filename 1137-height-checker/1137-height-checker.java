class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null || heights.length == 0){
            return 0;
        }
        int h = heights.length;
        int[] expected = new int[h];
        System.arraycopy(heights,0,expected,0,h);
        Arrays.sort(heights);

        int mm = 0;

        for(int i=0;i<h;i++){
            if(heights[i] != expected[i]){
                mm++;
            }
        }
    return mm;
    }
}