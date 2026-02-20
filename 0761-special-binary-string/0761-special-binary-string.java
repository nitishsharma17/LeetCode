class Solution {
    public String makeLargestSpecial(String s) {
        int x = 0;
        int y = 0;
        List<String> ls = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1' ) {
                x++;
            }else{
                x--;
            }
            if(x==0){
                ls.add("1" + makeLargestSpecial(s.substring (y+1,i)) + "0");
                y = i+1;
            }
        }
        Collections.sort(ls,Collections.reverseOrder());
        return String.join("",ls);
    }
}