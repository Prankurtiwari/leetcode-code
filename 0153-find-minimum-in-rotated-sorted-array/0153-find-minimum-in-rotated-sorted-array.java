class Solution {
    public int findMin(int[] nums) {
      int low = 0;
        int high  = nums.length -1;
        int res = nums[high];
        while(low<=high) {
            int mid = (low+high)/2;
            if (nums[mid] < res) {
                res = Math.min (res, nums[mid]);
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return res;
    }
}