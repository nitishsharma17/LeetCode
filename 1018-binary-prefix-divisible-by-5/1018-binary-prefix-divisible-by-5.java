class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ls = new ArrayList<>();
        int rem = 0;
        for(int num : nums){
            rem = ( rem * 2 + num ) % 5;
            ls.add(rem == 0);
        }
       return ls; 
    }
}