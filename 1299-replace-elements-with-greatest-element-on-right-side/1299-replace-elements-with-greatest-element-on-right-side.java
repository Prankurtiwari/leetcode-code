class Solution {
    public int[] replaceElements(int[] arr) {
       int max_so_far = -1;
        int size = arr.length - 1;
        for(int i = size; i>= 0; i--) {
            int temp = arr[i];
            arr[i] = max_so_far;
            max_so_far = Math.max(max_so_far, temp);
        }
        return arr;
    }
}