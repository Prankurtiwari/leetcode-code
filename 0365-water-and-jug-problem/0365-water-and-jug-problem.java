class Solution {

    public static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x%y);
    }

    public boolean canMeasureWater(int x, int y, int target) {
        
        if (x+y < target) {
            return false;
        }

        if (x+y == target) {
            return true;
        }
        

        return target % gcd(x,y) == 0;
    }
}