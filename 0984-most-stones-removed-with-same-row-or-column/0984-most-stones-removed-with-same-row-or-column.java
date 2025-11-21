class Solution {
    public void dfs( int src, List<List<Integer>> ls, boolean[] vis){
        vis[src] = true;
        for(int neigh : ls.get(src)){
            if(!vis[neigh]){
                dfs(neigh,ls,vis);
            }
        }
    }
    public int removeStones(int[][] stones) {
        int n = stones.length;
        List<List<Integer>> ls = new ArrayList<>();
         for (int i = 0; i < n; i++) {
            ls.add(new ArrayList<>());
        }
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    ls.get(i).add(j);
                    ls.get(j).add(i);
                }
            }
        }
        int comp = 0;
        boolean[] vis = new boolean[n];
        for(int i =0; i<n; i++){
            if(!vis[i]){
                dfs(i,ls,vis);
                comp++;
            }
        }
        return n - comp;  
    }
}