class Solution {
    public boolean isUgly(int n) {
        
        if ( n <= 0) {
            return false;
        }
        if (n == 1) {
            return true ;
        }
        while ((n % 2 == 0 || n % 3 == 0 || n % 5 == 0) && n > 1)  {
            if (n % 2 == 0) {
                n /= 2;
            }
            if (n % 3 == 0) {
                n /= 3;
            }
            if (n % 5 == 0) {
                n /= 5;
            }
        }
        return n == 1;
        
    }
}