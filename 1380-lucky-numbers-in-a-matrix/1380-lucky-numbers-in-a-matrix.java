class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
//         ArrayList<Integer> result = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         int row = matrix.length;
//         int col = matrix[0].length;
        

//         // Row wise min
//         for(int i=0;i<row;i++) {
//             int min = Integer.MAX_VALUE;
//             for(int j =0; j<col;j++) {
//                 if(matrix[i][j] < min) {
//                     min = matrix[i][j];
//                 }
//             }
//           map.put(min, map.getOrDefault(min, 0)+1);  
//         }
        
        
//         // Col wise max
        
//         for(int j=0;j<col;j++) {
//             int max = Integer.MIN_VALUE;
//             for(int i =0; i<row;i++) {
//                 if(matrix[i][j] > max) {
//                     max = matrix[i][j];
//                 }
//             }
//           map.put(max, map.getOrDefault(max, 0)+1);  
//         }
        
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//           if (entry.getValue() > 1) {
//               result.add(entry.getKey());
//           } 
// 	    }
        
//         return result;
//     }

        int small, big;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int k = 0;
            small = 999999;             
            for(int j = 0; j < matrix[0].length; j++){                
                if(small > matrix[i][j]){
                    small = matrix[i][j];
                    k = j;
                }
            }
            big = small;
            for(int j = 0; j < matrix.length; j++){
                big = Math.max(big, matrix[j][k]);
            }
            if(small == big) {
                ans.add(small);
            }
        }
        return ans;
    }
}