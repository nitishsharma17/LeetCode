class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        int rightidx = 0;

        for(int i = 0; i<=k-1; i++){
            lsum = lsum + cardPoints[i];
            maxSum = lsum;
            rightidx = n-1;
        }
        for(int i = k-1; i>=0; i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rightidx];
            rightidx = rightidx -  1;
            maxSum = Math.max(maxSum,lsum + rsum);
        }
        return maxSum;
    }
}