class Solution {
    
    // Normal
    
    // public void reverseString(char[] s) {
    //     int i = 0 ;
    //     int j  = s.length - 1;
    //     while(i<j) {
    //         char temp = s[i];
    //         s[i] = s[j];
    //         s[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }
    
    
    // Using rescusion
    public void revHelper(char[] s, int start, int end) {
        if (start >= s.length/2 ) {
          return;  
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        revHelper(s, start+1, end -1);
    }
    
    
    public void reverseString(char[] s) {
        revHelper(s, 0, s.length-1);
    }
    
}