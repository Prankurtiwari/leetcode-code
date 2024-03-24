class Solution {
    // https://www.youtube.com/watch?v=xvNwoz-ufXA
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        int[] prefixSum = new int[size];
        
        for(int i =0; i<size; i++) {
            prefixSum[i] = i==0 ? nums[0] : prefixSum[i-1]+nums[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        for(int i =0; i< size; i++) {
            int find  = prefixSum[i] - k;
            count += map.getOrDefault(find, 0);
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0)+1);
        }
        
        return count;
        
        
    }
}