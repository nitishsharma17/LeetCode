class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
        int a = s.length();
        int b = t.length();
        while(i<a && j<b){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == a;
    }
}