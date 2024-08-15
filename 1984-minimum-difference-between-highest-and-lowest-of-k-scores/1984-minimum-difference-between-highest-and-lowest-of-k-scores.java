class Solution {
    public int minimumDifference(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int start =0, end = k-1; end<nums.length; start++,end++) {
            res = Math.min(res, nums[end]-nums[start]);
        }
        return res;
    }
}