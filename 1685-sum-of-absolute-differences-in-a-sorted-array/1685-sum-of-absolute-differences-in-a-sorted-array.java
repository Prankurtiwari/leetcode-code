class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        //Discussed in lecture 33 on Feb 28 2024        
        

        /*
        
        for every a[i] the logic is 
        res[i] = left + right;(total n-1 terms)
        left part has i terms
                (a[i] - a[0]) + (a[i] - a[1])......+(a[i] - a[i-1])
               = (i*a[i]) - (a[0] + a[1]....+a[i-1])
               = (i*a[i]) - prefix_sum_of_i-1;
               
         right part has n-1 terms
                (a[i+1] - a[i]) + (a[i+1] - a[i]) .....+(a[n-1] -a[i])
                = (a[i+1] + a[i+2] .....a[n-1]) - (a[i] * (n-1-i))
                = sufix_sum_of_i+1 - (a[i] * (n-1-i))
        
        
        
        */


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