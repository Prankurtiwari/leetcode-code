class Solution {
    
    public double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double partAns = myPowHelper(x, n/2);
        if (n % 2 == 0) {
            return partAns * partAns;
        } else {
            return partAns * partAns * x;
        }
    }
    
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1/myPowHelper(x,Math.abs(n));
        }
        return myPowHelper(x,n);
    }
}