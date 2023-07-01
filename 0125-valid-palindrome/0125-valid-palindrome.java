class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        StringBuilder r1 = new StringBuilder();
        for(int i =0;i<s.length();i++) {
            char c =s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
               r1.append(c); 
            }
        }
        
        String s1 = r1.toString();
        String s2 = r1.reverse().toString();
        return s1.equals(s2);
    }
}