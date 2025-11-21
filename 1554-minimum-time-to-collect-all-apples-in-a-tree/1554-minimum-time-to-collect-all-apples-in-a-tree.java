class Solution {
    public int dfs(int src,int parent,List<List<Integer>> ls,List<Boolean> hasApple){
        int time = 0;
        for(int neigh : ls.get(src)){
            if(neigh == parent) continue;
            int timeChild = dfs(neigh,src,ls,hasApple);
            if(timeChild>0 || hasApple.get(neigh)){
                time += timeChild + 2; 
            }
        }
        return time;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i =0; i<n; i++){
            ls.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int from = edge[0];
            int to = edge[1];
            ls.get(from).add(to);
            ls.get(to).add(from);
        }
        return  dfs(0,-1,ls,hasApple);

    }
}