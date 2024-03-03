class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int lower = lowerBound(nums, target);
        int high = higherBound(nums, target);
        res[0] = lower;
        res[1] = high;
        return res;
    }
    
    public int lowerBound (int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int  l = 0;
        int r = nums.length-1;
        int ans = -1;
        while(l<=r) {
            int mid = (l+r)/2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    ans = mid;
                }
                r = mid -1;
            } else {
                l = mid +1;
            }
        }
        return ans;
    }
    
     public int higherBound (int[] nums, int target) {
         if (nums.length == 0) {
            return -1;
        }
        int  l = 0;
        int r = nums.length-1;
        int ans = -1;
        while(l<=r) {
            int mid = (l+r)/2;
            if (nums[mid] > target) {
                r = mid -1;
            } else {
                if (nums[mid] == target) {
                    ans = mid;
                }
                l = mid +1;
            }
        }
        return ans;
    }
}