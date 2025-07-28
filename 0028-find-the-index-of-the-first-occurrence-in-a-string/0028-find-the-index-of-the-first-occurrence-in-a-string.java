class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
    if (needle.isEmpty()){
        return 0;
    }
    if(b>a){
        return -1;
    }
     for(int i =0; i<=a-b;i++){
        boolean match = true;
        for(int j = 0;j<b;j++){
            if(haystack.charAt(i+j) != needle.charAt(j)){
                match = false;
                break;
            }
        }
        if(match){
            return i;
        }
     }
     return -1;
    }
}