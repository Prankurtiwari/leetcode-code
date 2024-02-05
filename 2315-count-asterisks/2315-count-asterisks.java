class Solution {
    public int countAsterisks(String s) {
        
        int result = 0;
        int count = 0;
        for(int i = 0; i< s.length(); i++) {
            if (count % 2 == 0 && s.charAt(i) == '*') {
                result++;
            } else if (s.charAt(i) == '|') {
                count++;
            } 
        }
        return result;
        
    }
}