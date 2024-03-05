class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // self 
//         int row = matrix.length == 1 ? 0 : findRow(matrix, target);
//         int start = 0;
//         int end = matrix[row].length;
//         while (start <= end) {
//             int mid = (start+end)/2;
//             if (matrix[row][mid] == target) {
//                 return true;
//             } else if (matrix[row][mid] > target) {
//                 end = mid -1;
//             } else {
//                 start = mid +1;
//             }
//         }
//         return false;
        
//     }
    
//     public  int findRow(int[][] matrix, int target) {
//         int start = 0;
//         int end = matrix.length;
//         int mid = 0;
//         if (end == 1) {
//             return 0;
//         }
//         while (start <= end) {
//             mid = (start+end)/2;
//             if (matrix[mid][0] == target) {
//                 return mid;
//             } else if (matrix[mid][0] > target) {
//                 end = mid -1;
//             } else {
//                 start = mid +1;
//             }
//         }
        
//         return mid;
//     }
        
        int i = 0, j = matrix[0].length-1;
        while(i<matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j]< target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
        
}