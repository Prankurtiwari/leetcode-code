class Solution {
    public int maximumDifference(int[] nums) {
        int result = 0;
        int[] min_array = new int[nums.length];
        for(int i =0; i<nums.length; i++) {
            min_array[i] = i> 0 ? Math.min(min_array[i-1], nums[i]) : nums[i];
        }
        
        for(int i =0; i<nums.length; i++) {
            result = Math.max(result, nums[i] - min_array[i]);
        }
        
        return result<= 0 ? -1 : result;
    }
}