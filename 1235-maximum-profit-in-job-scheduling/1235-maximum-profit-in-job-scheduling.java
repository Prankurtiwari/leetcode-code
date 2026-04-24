class Job {
    int start;
    int end;
    int profit;

    Job(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}

class Solution {

    public int lowerBound(List<Job> jobs, int target) {
        int low = 0;
        int high = jobs.size() -1;
        int res = jobs.size();

        while(low <= high) {
            int mid = (low + high)/2; 
            if (jobs.get(mid).start >= target) {
                res = Math.min(res, mid);
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return res;
    }

    public int maxProfit(List<Job> jobs, int[] dp, int n, int currIdx) {

        if (currIdx == n) return 0;

        if (dp[currIdx] != -1) return dp[currIdx];

        int nextIdx = lowerBound(jobs, jobs.get(currIdx).end);

        dp[currIdx] = Math.max(maxProfit(jobs, dp, n, currIdx+1), 
                                jobs.get(currIdx).profit + maxProfit(jobs, dp, n, nextIdx));

        return dp[currIdx];                 
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        List<Job> jobs = new ArrayList<>();

        for(int i=0; i<n; i++) {
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));
        }

        Collections.sort(jobs, (j1, j2) -> j1.start - j2.start);

        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return maxProfit(jobs, dp, n ,0);
    }
}