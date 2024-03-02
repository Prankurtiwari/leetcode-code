class Solution {
    
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> res = new ArrayList<>();
        if (row == 0) return res;
        List<Integer> first_row=new ArrayList<>();
        first_row.add(1);
        res.add(first_row);
        
        for(int i=1; i<row; i++) {
            
            List<Integer> pre = res.get(i-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j =1; j<i; j++) {
                int num = pre.get(j-1) + pre.get(j);
                cur.add(num);
            }
            
            cur.add(1);
            res.add(cur);
            
        }
        
        return res;
        
    }
    
}