class Solution {
    public boolean isPerfectSquare(int x) {
         if (x<=1) {
            return true;
        }
        int ans = 0;
        long start = 0;
        long end = x/2;
        while(start <=end) {
            long mid = start+(end-start)/2;
            if ((mid*mid) == x){
                return true;
            }else if (mid * mid < x) {
                start = mid +1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}