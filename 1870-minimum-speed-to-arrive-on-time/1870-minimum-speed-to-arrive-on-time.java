class Solution {

    public static boolean canReach(int[] dis, int speed, double time) {
        double totTime = 0.0d;
        int n = dis.length;
        for(int i=0; i<n; i++) {
            totTime += (i == n-1) ? (double)dis[i]/speed : Math.ceil ((double)dis[i]/speed);

            if (totTime > time) {
                return false;
            }
        }
        return totTime <= time;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        
    
        int res = -1;

        int low = 1;
        int high = 10_000_000;

        while(low <= high) {
            int mid = low + (high -low)/2;
            if (canReach(dist, mid, hour)) {
                res = mid;
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return res;
    }
}