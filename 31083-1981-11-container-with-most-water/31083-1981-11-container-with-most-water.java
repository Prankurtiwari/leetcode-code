class Solution {

    // https://www.youtube.com/watch?v=UuiTKBwPgAo
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int res = 0;
        while(left<right) {

            res = Math.max(res, Math.min(height[left], height[right]) * (right-left));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}