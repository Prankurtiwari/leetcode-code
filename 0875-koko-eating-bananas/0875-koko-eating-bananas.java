class Solution {
    
    public int getHours(int[] piles, int speed) {
        int hours = 0;
        for(int pile: piles) {
            hours += Math.ceil((pile*1.0)/speed);
        }
        return hours;
    }
    
    
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = piles[0];
        
        for(int pile : piles) {
            max = Math.max(max, pile);
        }
        int end = max;
        int ans = max;
        
        while(start <= end) {
            int mid = (start+end)/2;
            if(getHours(piles,mid) <= h) {
                ans = Math.min(ans,mid);
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        
        // O(n) giving TLE
        // for(int i = start; i<= end; i++) {
        //     if (getHours(piles,i) <= h) {
        //         return i;
        //     }
        // }
        return ans;
    }
}