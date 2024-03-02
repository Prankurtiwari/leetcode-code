class Solution {
    
    public int searchHelper(int[] nums, int low, int high, int target) {
        if (low >high) {
            return -1;
        } else {
            int mid = (low+high)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return searchHelper(nums, low, mid-1, target);
            } else {
                return searchHelper(nums, mid+1, high, target);
            }
        }
       
    }
    
    
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return searchHelper(nums, low, high, target);
    }
}