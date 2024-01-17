class Solution {
    public int maxFrequencyElements(int[] nums) {
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
                sum += i;
            }
        }
        return sum;
    }
}