class Solution {
      private long dfs(int src, ArrayList<ArrayList<Integer>> adj, int[] values, int k, boolean[] vis) {
        vis[src] = true;
        long sum = values[src];
        for (int neigh : adj.get(src)) {
            if (!vis[neigh]) {
                sum += dfs(neigh, adj, values, k, vis);
            }
        }
        if (sum % k == 0) ans++;
        return sum;
    }
    long ans = 0;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        dfs(0, adj, values, k, vis);
        return (int) ans;
    }
}
