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
        
        /*
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
        */
