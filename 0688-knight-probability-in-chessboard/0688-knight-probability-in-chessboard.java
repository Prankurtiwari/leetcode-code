class Solution {
    public static boolean isValid(int ni, int nj, int n) {
        if (ni<0 || ni >= n || nj<0 || nj>=n) {
            return false;
        }
        return true;
    }

    public double knightProbability(int n, int k, int row, int col) {
        
        double[][] curr = new double[n+1][n+1];
        double[][] next = new double[n+1][n+1];

        curr[row][col] = 1;

        for(int mv=1; mv<=k; mv++) {

            for(int i=0; i<n; i++) {
                for(int j =0; j<n; j++) {
                    
                    int ni;
                    int nj;

                    ni = i+2;
                    nj = j+1;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i+2;
                    nj = j-1;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i+1;
                    nj = j+2;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i+1;
                    nj = j-2;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i-1;
                    nj = j+2;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i-1;
                    nj = j-2;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i-2;
                    nj = j+1;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }

                    ni = i-2;
                    nj = j-1;

                    if(isValid(ni, nj, n)) {
                        next[ni][nj] += curr[i][j]/8.0;
                    }
                }
            }

            curr = next;
            next = new double[n+1][n+1];
        }


        double res = 0.0d;
        for(int i=0; i<n; i++) {
            for(int j =0; j<n ;j++) {
                res += curr[i][j];
            }
        }

        return res;   
    }
}