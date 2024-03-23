class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int num: nums) {
            arr.put(num, arr.getOrDefault(num,0) + 1);
        }
        
        int maxFre = 0, finalAns = -1;
         for (Integer num : arr.keySet()) {
             int curFre = arr.get(num);
             
             if ((num%2 ==1) || curFre < maxFre ) {
                 continue;
             }
             
             if (curFre > maxFre || num < finalAns) {
                 maxFre = curFre;
                 finalAns = num;
             }
         }
        return finalAns;
    }
}