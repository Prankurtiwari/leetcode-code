class Solution {
    public int findUnsortedSubarray(int[] nums) {
       // Using sort
        int n = nums.length;
        int[] unsorted = new int[n];
        for(int i=0;i<n;i++) {
            unsorted[i] = nums[i];
        }
        Arrays.sort(nums);
        int start = -1, end = -2;
        for(int i =0; i<n; i++) {
            if (unsorted[i] != nums[i]) {
                  if(start == -1) {
                    start = i;
                } else {
                    end = i;
                }  
            }   
        }
        
        return end-start+1;
    }
}