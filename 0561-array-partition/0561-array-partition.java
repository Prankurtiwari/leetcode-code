class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for(int i = n-1; i-1>=0; i -= 2 ) {
            result += Math.min(nums[i], nums[i-1]);
        }
        return result;
    }
}