

class Solution {

    public int[] dij(int src, int n, ArrayList<ArrayList<int[]>> adj) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] time = new int[n];
        Arrays.fill(time, Integer.MAX_VALUE);

        time[src] = 0;
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int u = pair[0];
            int d = pair[1];

            if (d > time[u]) continue;

            for (int[] neigh : adj.get(u)) {
                int v = neigh[0];
                int w = neigh[1];

                if (time[u] + w < time[v]) {
                    time[v] = time[u] + w;
                    pq.offer(new int[]{v, time[v]});
                }
            }
        }
        return time;
    }


    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] t : times) {
            int u = t[0] - 1;
            int v = t[1] - 1;
            int w = t[2];
            adj.get(u).add(new int[]{v, w});
        }

        int[] mintime = dij(k - 1, n, adj);

        int res = 0;
        for (int t : mintime) {
            if (t == Integer.MAX_VALUE) return -1;
            res = Math.max(res, t);
        }
        return res;
    }
}
