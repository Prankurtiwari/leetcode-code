class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, left = 0, down = matrix.length -1, right = matrix[0].length -1;
        int dir = 0;
        while(top <= down && left <= right) {
            
            if (dir == 0) {
                for(int i =left; i<=right; i++){
                  result.add(matrix[top][i]);  
                }
                    top++;
            } else if (dir == 1) {
                for(int i =top; i<=down; i++){
                  result.add(matrix[i][right]);  
                }
                   right--;
            } else if (dir == 2) {
                for(int i = right; i>=left; i--){
                  result.add(matrix[down][i]);  
                }
                    down--;    
            } else if (dir == 3) {
                for(int i = down; i>=top; i--){
                  result.add(matrix[i][left]);  
                }
                    left++;
            }
            dir++;
            dir = dir % 4;
        }
        return result;
    }
}