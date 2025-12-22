class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int num : nums){
            int sum = 0;
            int temp = num;
            while(temp>0){
                sum += temp%10;
                temp /= 10;
            }
            if(map.containsKey(sum)){
                max = Math.max(max,map.get(sum)+num);
                map.put(sum,Math.max(map.get(sum),num));
            }else{
                map.put(sum,num);
            }

        }
        return max;
    }
}