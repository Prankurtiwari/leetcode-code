class Solution {

    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        }
        return gcd(y, x%y);
    }

    public boolean isReachable(int x, int y) {
        int gcd = gcd(x,y);
        int n = gcd;
        while(n % 2 == 0 && n > 1) {
            n/= 2;
        }
        return n ==1;
    }
}