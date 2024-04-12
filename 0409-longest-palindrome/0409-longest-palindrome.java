class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
         int[][] freq = new int[2][26];
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                freq[0][c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                freq[1][c - 'a']++;
            }
        }
        boolean isOddThere = false;
        for(int i=0; i<26; i++) {
            if (freq[0][i] %2 == 0) {
                result = result + freq[0][i];
            } else {
               isOddThere = true;
                result = result + (freq[0][i] -1);
            }
             if (freq[1][i] %2 == 0) {
                result = result + freq[1][i];
            } else {
               isOddThere = true;
                result = result + (freq[1][i] -1);
            }
        }
        
        return isOddThere ? (result+1) : result;
    }
}