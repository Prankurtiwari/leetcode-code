class Solution {
    public String largestPalindromic(String num) {
        
        int[] count = new int[10];
        int n = num.length();
        
        for(int i=0; i<n; i++) {
            count[num.charAt(i)-'0']++;
        }
        
        
        StringBuilder s = new StringBuilder();
        
        for(int i=9;i>=0; i--) {
            
            if (count[i] > 0) {
                
                if (i ==0 && s.length() == 0) {
                    continue;
                }
                
                for(int d=0;d<count[i]/2; d++) {
                    s.append(i);
                }
                count[i] = count[i]%2;
            }
            
        }
        
        String mid = "";
        
        for(int i=9;i>=0;i--) {
            if (count[i] > 0) {
                mid += i;
                break;
            }
        }
        
        StringBuilder res = new StringBuilder();
        res.append(s);
        res.append(mid);
        res.append(s.reverse());
        
        return res.toString();
        
    }
}