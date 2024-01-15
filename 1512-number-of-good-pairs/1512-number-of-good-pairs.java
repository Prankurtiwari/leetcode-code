class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        // O(n^2) solution
        /*
        int count = 0;
        for(int i = 0 ; i< nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
        */
        
       // O(n) solution) 
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
          count += mp.getOrDefault(nums[i], 0);
          mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        return count;
        
    }
}
