class Solution {
    private String reverse(String res){
        StringBuilder sb = new StringBuilder(res);
        return sb.reverse().toString();
    }
    public String baseNeg2(int n) {
        if(n == 0) return "0";
        String res = "";
        while(n != 0){
            int rem = n % -2;
            n = n / -2;
            if(rem < 0){
                rem += 2;
                n += 1;
            }
            res += rem;
        }
        return reverse(res);
    }
}