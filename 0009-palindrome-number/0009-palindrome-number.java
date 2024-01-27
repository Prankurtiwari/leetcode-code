class Solution {
    public boolean isPalindrome(int x) {
        
        // non-optimised
       /* if(x<0) {
            return false;
        }
        String str = Integer.toString(x);
        String str1 = new StringBuilder(str).reverse().toString();

        return str.equals(str1);
        */
        
        // optimised
        String s = String.valueOf(x); 
        int n = s.length();

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)){
                return false;
            } 
        }
        return true;
    }
}