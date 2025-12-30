import java.util.HashMap;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;

        for (int i = 0; i + 2 < row; i++) {
            for (int j = 0; j + 2 < col; j++) {

                HashMap<Integer, Integer> mp = new HashMap<>();
                int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                boolean magic = true;

                for (int r = i; r < i + 3 && magic; r++) {
                    int rsum = 0;
                    for (int c = j; c < j + 3; c++) {
                        int v = grid[r][c];
                        if (v < 1 || v > 9 || mp.containsKey(v)) {
                            magic = false;
                            break;
                        }
                        mp.put(v, 1);
                        rsum += v;
                    }
                    if (rsum != sum) magic = false;
                }

                for (int c = j; c < j + 3 && magic; c++) {
                    int csum = 0;
                    for (int r = i; r < i + 3; r++) csum += grid[r][c];
                    if (csum != sum) magic = false;
                }

                if (magic) {
                    int d1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
                    int d2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];
                    if (d1 == sum && d2 == sum) res++;
                }
            }
        }
        return res;
    }
}
