class Solution {
    // https://www.youtube.com/watch?v=9EkjO7yI60M
    public int longestString(int x, int y, int z) {
        if (x == y) {
            return x * 4 + z*2;
        } else {
           return Math.min(x, y) * 4 + 2 + z*2;
        }
    }
}