class Solution {
    
    // Lecture 35 : March 3 2024
    
    public int search(int[] nums, int target) {
        
        int l =0;
        int h = nums.length-1;
        int last = nums[h];
        while(l<=h) {
            int mid = (l+h)/2;
           
            if (target > last && nums[mid] <= last) {
                // Target in r1 and you are in r2
                h = mid-1;
            } else if (target <= last && nums[mid] > last) {
                //target in r2 and you are in r1
                l = mid +1;
            } else {
                // you are in r1 and tagret is in r1 OR
                // you are in r2 and target is in r2 both are same then apply norminal binary                       //search
                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    l = mid +1;
                } else {
                    h =mid-1;
                }
            }
         
        }
        return -1;
        
        
        
    }
}