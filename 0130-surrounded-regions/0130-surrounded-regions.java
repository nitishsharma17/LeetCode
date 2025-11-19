class Solution {
    public class Pair {
        int x;
        int y;

        Pair(int x , int y){
            this.x = x;
            this.y = y;
        }
    }

    public void solve(char[][] board) {
         int n = board.length;
        int m = board[0].length;

        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(board[i][0] == 'O') q.add(new Pair(i, 0));
            if(board[i][m-1] == 'O') q.add(new Pair(i, m-1));
        }

        for(int j = 0; j < m; j++){
            if(board[0][j] == 'O') q.add(new Pair(0, j));
            if(board[n-1][j] == 'O') q.add(new Pair(n-1, j));
        }

        while(!q.isEmpty()){
            Pair p = q.remove();
            int r = p.x;
            int c = p.y;

            if(r < 0 || r >= n || c < 0 || c >= m) continue;
            if(board[r][c] != 'O') continue;

            board[r][c] = 'T';

            q.add(new Pair(r+1, c));
            q.add(new Pair(r-1, c));
            q.add(new Pair(r, c+1));
            q.add(new Pair(r, c-1));
        }

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(board[i][j] == 'O') board[i][j] = 'X' ;
                if(board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }   
}

