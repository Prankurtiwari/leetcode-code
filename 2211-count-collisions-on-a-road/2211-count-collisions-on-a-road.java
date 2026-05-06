class Solution {
    public int countCollisions(String d) {
        int n = d.length();
        int count = 0;

        int i = 0;
        int j = n-1;

        while(i<n && d.charAt(i) == 'L'){
            i++;
        }

        while( j>=0 && d.charAt(j) == 'R') {
            j--;
        }

        for(int k =i; k<=j; k++) {
            if (d.charAt(k) != 'S') {
                count++;
            }
        }
        return count;
    }

}