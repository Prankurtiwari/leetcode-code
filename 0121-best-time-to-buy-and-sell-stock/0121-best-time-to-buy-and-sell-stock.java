class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        
        int min_so_far = prices[0];
        int max_profit = 0;
        for(int i =1 ; i<prices.length;i++){
            min_so_far = Math.min(min_so_far, prices[i]);
            max_profit = Math.max(max_profit,prices[i]-min_so_far);
        }
        return max_profit;
    }
}
        
        /* Brute force getting TLE
        int max_profit = 0;
        
        for(int i=0;i<prices.length;i++) {
            for(int j = i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if(max_profit< profit) {
                    max_profit= profit;
                }
                    
            }
            
        }
        return max_profit;
    }
    */