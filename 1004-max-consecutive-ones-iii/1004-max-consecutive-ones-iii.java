class Solution {
    public int longestOnes(int[] nums, int k) {
        
        //Complexity : O(2n) 
        // Logic is dynamic sliding window
        // Arrays - Practice 3, 12-Feb-2024 2nd question.
        int low = 0;
        int result = Integer.MIN_VALUE;
        int zero_cnt = 0;
        int length = nums.length;
        
       for(int high = 0; high<length; high++) { 
            if (nums[high] == 0) {
                zero_cnt++;
                while(zero_cnt > k) {
                    if(nums[low] == 0) {
                        zero_cnt--;
                    }
                    low++;
                }
            }
            result = Math.max(result, (high-low+1)) ; 
        }
        
        return result;
    }
}