class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // To handle '999' => 999 + 1 = 1000
        int[] new_digits = new int[n +1];
        new_digits[0] = 1;
        return new_digits;
    }
}