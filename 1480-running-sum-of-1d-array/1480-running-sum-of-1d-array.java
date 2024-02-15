class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length; 
        int[] result = new int[n];
        int sum = 0;
        for(int i =0; i<n; i++) {
            
            // Self thought
            // sum += nums[i];
            // result[i] = sum;
            
            // class idea

            result[i] = i > 0 ? result[i-1] + nums[i] : nums[i];
        }
        
        return result;
    }
}