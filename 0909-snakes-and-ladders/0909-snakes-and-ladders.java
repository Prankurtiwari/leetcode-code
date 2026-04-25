class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[(n * n) + 1];
        int[] cell = flat(board);
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- >0) {
                int curr = q.poll();

                if (curr == n * n)
                    return moves;

                for (int i = 1; i <= 6; i++) {
                    int next = curr + i;

                    if (next > n * n)
                        break; // imp

                    if (cell[next] != -1) {
                        next = cell[next];
                    }

                    if (!visited[next]) {
                        q.offer(next);
                        visited[next] = true;
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    public static int[] flat(int[][] board) {
        int n = board.length;
        int[] res = new int[n*n+1];
        boolean LToR = true;
        int idx = 1;
        for(int i=n-1; i>=0; i--) {

            if (LToR) {
                for(int col =0; col<n; col++) {
                    res[idx++] = board[i][col];
                }
            } else {
                for(int col = n-1; col>=0; col--) {
                    res[idx++] = board[i][col];
                }
            }

            LToR = !LToR;
        }

        return res;
    }
}