class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
        
        int start = 0;
        int end = s.length()-1;
        
        while(start<=end) {
            char startc = Character.toLowerCase(s.charAt(start));
            char endc = Character.toLowerCase(s.charAt(end));
            if(!Character.isLetterOrDigit(startc)) {
                start++;
            }
            else if(!Character.isLetterOrDigit(endc)) {
                end--;
            }
            else{
                if (startc != endc){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}