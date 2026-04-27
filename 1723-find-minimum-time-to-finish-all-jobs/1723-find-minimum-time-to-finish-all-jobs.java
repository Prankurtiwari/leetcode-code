class Solution {

    public boolean canAssign(int[] jobs, int[] workers, int maxWorkLoad, int curr) {

        if (curr == jobs.length) return true;

        for(int i =0; i<workers.length; i++) {

            if (workers[i] + jobs[curr] <= maxWorkLoad) {
                workers[i] += jobs[curr];
                if (canAssign(jobs, workers, maxWorkLoad, curr+1)) {
                    return true;
                }
                workers[i] -= jobs[curr];

                if (workers[i] == 0) break;
            }

        }

        return false;
    }

    public boolean canDistribute(int[] jobs, int maxWorkLoad, int k) {
        int[] workers = new int[k];
        return canAssign(jobs, workers, maxWorkLoad, 0);
    }

    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        int n = jobs.length;
        int low = jobs[n-1];
        int high = Arrays.stream(jobs).sum();
        int res = high;

        while(low <= high) {
            int mid = (low +high)/2;

            if (canDistribute(jobs, mid, k)) {
                res = mid;
                high = mid -1;
            } else {
                low = mid +1;
            } 
        }

        return res;
    }
}