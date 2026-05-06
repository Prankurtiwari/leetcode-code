class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] ways = new int[n][m];

        if (grid[0][0] == 1) return 0;

        if (grid[n-1][m-1] == 1) return 0;

        ways[0][0] = 1;

        for(int i=1;i<n;i++) {
            ways[i][0] = (grid[i][0] == 1) ? 0:ways[i-1][0];
        }

        for(int j=1;j<m;j++) {
            ways[0][j] = (grid[0][j] == 1) ? 0:ways[0][j-1];
        }

        for(int i =1;i<n;i++) {
            for(int j=1;j<m;j++) {
                ways[i][j] = grid[i][j] == 1 ? 0 : ways[i-1][j] + ways[i][j-1];
            }
        }

        return ways[n-1][m-1];
    }
}