class Solution {

    private void dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        for (int neigh : adj.get(src)) {
            if (!vis[neigh]) {
                dfs(neigh, adj, vis);
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] c : connections) {
            int u = c[0];
            int v = c[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
                components++;
            }
        }
        return components - 1;
    }
}
