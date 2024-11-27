class Solution {
    
    public static int min(int a, int b, int c) {
       return  Math.min(a, Math.min(b,c));
    }
    
    public static int max(int a, int b, int c) {
       return Math.max(a, Math.max(b,c));
    }
    
    public int maxProduct(int[] nums) {
       int res  =nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        int n = nums.length;
        for(int i =1; i<n; i++) {
            
            int temp = max(nums[i], currMax*nums[i], currMin*nums[i]);
            
            currMin = min(nums[i], currMax*nums[i], currMin*nums[i]);
            
            currMax = temp;
            
            res = Math.max(res, currMax);
        }
        
        return res;
    }
}