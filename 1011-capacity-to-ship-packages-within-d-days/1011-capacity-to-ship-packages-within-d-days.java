class Solution {
    
    public int getDays(int[] weight, int cap) {
       int curLoad = 0;
        int days = 1;
        for(int i =0; i<weight.length; i++) {
            if (weight[i] <= cap - curLoad) {
                curLoad += weight[i];
            } else {
                curLoad = 0;
                days++;
                curLoad += weight[i];
            }
        }
        return days;
    }
    
    public int getMax(int[] weights) {
        int max = weights[0];
        for(int weight : weights) {
            max = Math.max(max, weight);
        }
        return max;
    }
    
    public int getSum(int[] weights) {
        int sum = 0;
        for(int weight : weights) {
            sum += weight;
        }
        return sum;
    }
    
    
    public int shipWithinDays(int[] weights, int days) {
        int start = getMax(weights);
        int end = getSum(weights);
        
        // O(n) 
        
        // for(int i = start; i<= end; i++) {
        //     if (getDays(weights, i) <= days) {
        //         return i;
        //     }
        // }
        
        int ans = end;
        while(start <= end) {
            int mid = (start+end)/2;
            if (getDays(weights,mid) <= days) {
                ans = Math.min(ans,mid);
                end = mid -1;
            } else {
                start = mid +1;
            }
            
        }
        
        return ans;
    }
}