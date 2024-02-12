class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0 ;
        for(int i =0; i<nums.length;i++) {
            curr_sum += nums[i];
            max_sum = Math.max(curr_sum, max_sum);
            curr_sum = curr_sum < 0 ? 0 : curr_sum; 
        }
        return max_sum;
    }
}