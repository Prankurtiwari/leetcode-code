class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // O(n) space
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int[] ans = new int[size];
        
        left[0] = 1;
        for(int i=1;i<size;i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        right[size-1] = 1;
        
        for(int i = size-2;i>=0;i--) {
            right[i] = right[i+1] * nums[i+1]; 
        }
        
        for(int i=0;i<size;i++) {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
        
        // O(1) space
//         int size = nums.length;
//         int[] ans = new int[size];
//         for(int i = 0;i<size;i++) {
//             ans[i] = 1;

//         }
//         int curr= 1;
//         for(int i = 0;i<size;i++) {
//             ans[i] = ans[i] * curr;
//             curr = curr * nums[i];
//         }
//         curr = 1;
//         for(int i = size-1; i>=0; i--) {
//             ans[i] = ans[i] * curr;
//             curr = curr *nums[i];
//         }
//         return ans;
    }
}