class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int size = nums.length;
        int prefixSum[] = new int[size];
        int sufixSum[] = new int[size];
        int result[] = new int[size];
        
        for(int i =0 ;i< size; i++) {
            prefixSum[i] = i ==0 ? nums[i] : (prefixSum[i-1] + nums[i]);
        }
        
        for(int i =size-1 ;i>=0; i--) {
            sufixSum[i] = i==size-1 ? nums[i] : (sufixSum[i+1] + nums[i]);
        }
        
        
        for(int i =0;i<size;i++) {
            int preSum  = i==0 ? 0 : prefixSum[i-1]; 
            int sufSum = i ==size-1 ? 0 : sufixSum[i+1];
            
            result[i] = ((i*nums[i]) - preSum) + (sufSum - (nums[i] * (size-1-i)));    
        }
        
        return result;
        
    }
}