class Solution {
    public String toLowerCase(String s) {
        // Sol 1:
        // return s.toLowerCase();
        
        // Sol 2:
        String sb = "";
        for(int i =0; i<s.length(); i++){
            if (s.charAt(i) >= 65 && s.charAt(i)<= 90){
                sb = sb + (char)(s.charAt(i) + 32);
                
            } else {
                sb = sb+s.charAt(i);
            }
        }
        
        return sb;
    }
}