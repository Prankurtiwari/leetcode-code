class Solution {
    public int longestOnes(int[] nums, int k) {
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