class Solution {
    
    public int[] sortMergeArray(int[] left, int[] right){
        int i=0, j=0, k=0;
        int size = left.length+right.length;
        int[] result = new int[size];
        
        while(i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            } 
            k++;
        }
        while(i<left.length) {
            result[k] =left[i];
            i++;
            k++;
        }
        
        while(j<right.length) {
            result[k] =right[j];
            j++;
            k++;
        }
        
        return result;
        
    }
    
    public int[] sortArray(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums;
        }
        int[] left = Arrays.copyOfRange(nums, 0, size/2);
        int[] right = Arrays.copyOfRange(nums, size/2, size);
        
        left = sortArray(left);
        right = sortArray(right);
        
        return sortMergeArray(left, right);
        
    }
}