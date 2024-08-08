class NumArray {

    int[] pre_sum;
    public NumArray(int[] nums) {
        this.pre_sum = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            pre_sum[i] = i==0 ? nums[i] : nums[i]+pre_sum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return pre_sum[right];
        }
        return pre_sum[right] - pre_sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */