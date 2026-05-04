class Cell {
    int row;
    int col;

    Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n = grid.length;
        
        boolean[][] vistied = new boolean[n][n];

        if (n<1)
        return -1;

        if (grid[0][0] == 1) {
            return -1;
        }

        if (grid[n-1][n-1]== 1) {
            return -1;
        }

        Queue<Cell> q = new LinkedList<>();
        q.offer(new Cell(0,0));
        int steps = 1;

        vistied[0][0] = true;

        while(!q.isEmpty()) {
            int size = q.size();

            while(size-->0) {
                Cell c = q.poll();
                int curr_row = c.row;
                int curr_col = c.col;

                if (curr_row == n-1 && curr_col == n-1) {
                    return steps;
                }

                int next_row = c.row+1;
                int next_col = c.col;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row-1;
                next_col = c.col;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row;
                next_col = c.col+1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row;
                next_col = c.col-1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row+1;
                next_col = c.col+1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row+1;
                next_col = c.col-1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row-1;
                next_col = c.col+1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

                next_row = c.row-1;
                next_col = c.col-1;

                if (next_row >= 0 && next_row < n && next_col >= 0 && next_col < n 
                    && grid[next_row][next_col] == 0 &&  !vistied[next_row][next_col]) {
                        
                      q.offer(new Cell(next_row, next_col));
                      vistied[next_row][next_col] = true;
                }

            }
            steps++;
        }
        return -1;
    }

}