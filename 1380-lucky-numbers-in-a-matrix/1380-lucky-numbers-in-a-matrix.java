class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        

        // Row wise min
        for(int i=0;i<row;i++) {
            int min = Integer.MAX_VALUE;
            for(int j =0; j<col;j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
          map.put(min, map.getOrDefault(min, 0)+1);  
        }
        
        
        // Col wise max
        
        for(int j=0;j<col;j++) {
            int max = Integer.MIN_VALUE;
            for(int i =0; i<row;i++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
          map.put(max, map.getOrDefault(max, 0)+1);  
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() > 1) {
              result.add(entry.getKey());
          } 
	    }
        
        return result;
    }
}