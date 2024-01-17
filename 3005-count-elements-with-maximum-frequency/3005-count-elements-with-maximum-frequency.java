class Solution {
    public int maxFrequencyElements(int[] nums) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int sum = 0;

        for(Integer i : map.values()) {
            if (i > max) {
                sum = 0;
                max = i;
                sum += i;
            }
             else if (i == max) {    
                max = i;
                sum += i;
            }
        }
        return sum;
        */

        //better solution


        // freq
        int[] arr = new int[101];
        for(int i : nums) {
            arr[i]++;
        }
        
        //max
        int max = 0;
        for(int i : arr) {
            max = Math.max(max, i);
        }
        
        //sum
        int sum = 0;
        for(int i : arr) {
            sum += i == max ? i : 0;
        }
        return sum;
    }
}