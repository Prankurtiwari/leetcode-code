class Solution {
    public String reverseOnlyLetters(String s) {
        int length = s.length();
        if(length == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder(s);
        int i=0, j=length-1;
        while(i<j){
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))) {
                char temp = s.charAt(i);
                result.setCharAt(i,s.charAt(j));
                result.setCharAt(j,temp);
                i++;
                j--;
            } else if (!Character.isAlphabetic(s.charAt(i))) {
                i++;
            } else if (!Character.isAlphabetic(s.charAt(j))) {
                j--;
            } else {
                i++;
                j--;
            }  
        }
        return result.toString();
    }
}