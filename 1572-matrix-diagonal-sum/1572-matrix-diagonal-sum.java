class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for(int i =0,j=size-1;i<size; i++, j--) {
            sum += mat[i][i];
            if (i != j) {
                sum += mat[i][j];
            }
        }
        return sum;
        
        
    }
}