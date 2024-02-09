class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_formula = (n * (n+1)) /2;
        int sum_array = 0;
        for(int i =0; i<n; i++) {
            sum_array += nums[i];
        }
        return sum_formula - sum_array;
    }
}