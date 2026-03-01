class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    private static int backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int start) {
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return 0;
        }
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            if (backtrack(ans, temp, candidates, target - candidates[i], i) == -1) {
                temp.remove(temp.size() - 1);
                continue;
            }
            temp.remove(temp.size() - 1);
        }
        return 0;
    }
}