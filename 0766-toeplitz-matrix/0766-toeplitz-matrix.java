class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row  = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i+1 < row; i++) {
            for(int j = 0; j+1 < col; j++){
                if (matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}