class Solution {
    class Pair{
        int row;
        int col;
        int time;

        public Pair(int r, int c, int t){
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if(n == 0 || m == 0){
            return -1;
        }

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) q.add(new Pair(i, j, 0));
                if(grid[i][j] == 1) fresh++;
            }
        }

        int time = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()){
            Pair curr = q.remove();
            int r = curr.row;
            int c = curr.col;
            int t = curr.time;

            time = Math.max(time, t);

            for(int k = 0; k < 4; k++){
                int nr = r + dr[k];
                int nc = c + dc[k];     
                if(nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;  
                    fresh--;
                    q.add(new Pair(nr, nc, t + 1));
                }
            }
        }

        if(fresh > 0) return -1;
        return time;
    }
}
