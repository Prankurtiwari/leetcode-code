class Solution {
    public int numSpecial(int[][] mat) {
        
        
        // O(m*n + m+n) 
        int result = 0;
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i =0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if (mat[i][j] == 0) {
                    continue;
                }
                boolean correct = true;
                
               for(int a =0; a<row; a++){
                    if(a != i && mat[a][j] == 1) {
                        correct =false;
                        break;
                    }
                }
                
                for(int a =0; a<col; a++){
                    if(a != j && mat[i][a] == 1) {
                        correct =false;
                        break;
                    }
                }
                if (correct) {
                    result++;
                }
            }
        }
        
        return result;
    }
}