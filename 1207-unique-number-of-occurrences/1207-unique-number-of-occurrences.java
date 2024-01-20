class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        HashMap<Integer, Integer> mp = new HashMap();
        for(int val: arr) {
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(mp.values());
        return mp.values().size() == set.size();
    }
}