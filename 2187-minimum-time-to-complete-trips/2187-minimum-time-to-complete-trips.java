class Solution {
    public long minimumTime(int[] time, int totalTrips) {
       int n = time.length;
        Arrays.sort(time);
        long low = (long) time[0], high = (long) time[n - 1] * totalTrips;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (check(time, mid, totalTrips)){
                high = mid;
            }else
                low = mid + 1;
        }
        return low;
    }
    
    private boolean check(int[] time, long mid, int totalTrips) {
        long trips = 0;
        for (int x : time) {
            trips += (mid / x);
            if (trips >= totalTrips)
                return true;
        }
        return false;
    }

}