class Solution {

    public boolean canSwin(int[][] grid, boolean[][] visited, int x, int y, int n, int time) {

       
        if (x == n-1 && y == n-1) {
            return true;
        }
        visited[x][y] = true;
        // move left
        if (x-1 >=0 && !visited[x-1][y] && grid[x-1][y] <= time) {
            if (canSwin(grid, visited, x-1, y, n, time))
                return true;
        }

        // move right
        if (x+1 < n && !visited[x+1][y] && grid[x+1][y] <= time) {
            if (canSwin(grid, visited, x+1, y, n, time))
                return true;
        }

        // move up
        if (y+1 <n && !visited[x][y+1] && grid[x][y+1] <= time) {
            if (canSwin(grid, visited, x, y+1, n, time))
                return true;
        }

        // move down
        if (y-1 >=0 && !visited[x][y-1] && grid[x][y-1] <= time) {
            if (canSwin(grid, visited, x, y-1, n, time))
                return true;
        }

        return false;
    }

    public int swimInWater(int[][] grid) {

        int n = grid.length;
        

        int low = 0;
        int high = n*n -1;

        int res = n*n -1;

        while(low <= high) {

            boolean[][] visited = new boolean[n][n];

            int mid = low + (high - low) / 2;

            if (grid[0][0] <= mid && canSwin(grid, visited, 0, 0, n, mid)) {
                res = mid;
                high = mid -1;
            } else {
                low = mid +1;
            }
        }

        return res;
        
    }
}