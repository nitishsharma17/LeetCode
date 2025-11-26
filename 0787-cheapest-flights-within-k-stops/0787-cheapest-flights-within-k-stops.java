class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        // for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        // for (int[] f : flights) adj.get(f[0]).add(new int[]{f[1], f[2]});

        // PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // pq.offer(new int[]{0, src, 0});

        // int[] bestSteps = new int[n];
        // Arrays.fill(bestSteps, Integer.MAX_VALUE);
        // bestSteps[src] = 0;

        // while (!pq.isEmpty()) {
        //     int[] curr = pq.poll();
        //     int cost = curr[0];
        //     int node = curr[1];
        //     int step = curr[2];

        //     if (node == dst) return cost;
        //     if (step > k) continue;

        //     for (int[] next : adj.get(node)) {
        //         int neigh = next[0];
        //         int price = next[1];
        //         if (step + 1 <= bestSteps[neigh] && step + 1 <= k + 1) {
        //             bestSteps[neigh] = step + 1;
        //             pq.offer(new int[]{cost + price, neigh, step + 1});
        //         }
        //     }
        // }
        // return -1;




        //bellmanford

        int price[] = new int[n];
        Arrays.fill(price,Integer.MAX_VALUE);
        price[src] = 0;
        for(int i =0; i<k+1; i++){
            int [] temp = Arrays.copyOf(price,n);
            for(int[] flight : flights){
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];

                if(price[u]!=Integer.MAX_VALUE && price[u] + w < temp[v]){
                    temp[v] = price[u] + w;
                }
            }
            price  = temp;
        }
        return (price[dst]==Integer.MAX_VALUE) ?-1:price[dst];
    }
}
