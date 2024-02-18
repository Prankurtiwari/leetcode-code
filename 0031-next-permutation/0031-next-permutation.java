class Solution {
    public void nextPermutation(int[] nums) {
        
        
        /*
        Learn yard lecture  on 17 Feb.
        1.Start from end and move the ith pointer till it is non-ascedning.
        2.Now when i pointer is at specific index. Reiterate from last to ith with j pointer till nums[i]>= nums[j] i.e find first number greater than nums[i].
        3. Swap i and j.
        4. reverse i+1 till end.
        
        */
        
        
        
        
        
        
        int n = nums.length;
        int i = n-2;
        
        while(i>= 0 && nums[i+1] <= nums[i])
        {
            i--;
        }
        if(i>=0) {
            int j = n - 1;
            while(j>=i+1 && nums[j]<= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1); 
    }
     public void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    
}