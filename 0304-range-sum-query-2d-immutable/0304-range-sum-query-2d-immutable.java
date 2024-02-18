class NumMatrix {
    
    // Lecture on 16 Feb;
    int[][] prearray = new int[200][200];

    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++) {
            for(int j =0;j<col;j++) {
                if (i ==0 && j ==0) {
                    prearray[i][j] = matrix[i][j];
                } else if (i==0) {
                    prearray[i][j] = prearray[i][j-1] + matrix[i][j];
                } else if (j==0) {
                    prearray[i][j] = prearray[i-1][j] + matrix[i][j];
                } else {
                    prearray[i][j] = prearray[i-1][j] + prearray[i][j-1] 
                        - prearray[i-1][j-1] + matrix[i][j];
                }
            }
        }
    }
    public int sumRegion(int row0, int col0, int row1, int col1) {
        int ans = prearray[row1][col1];
        if (row0>0) {
            ans -= prearray[row0-1][col1];
        }
        if (col0>0) {
            ans -= prearray[row1][col0-1];
        }
        if (row0 > 0 && col0 > 0) {
            ans += prearray[row0-1][col0-1];
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */