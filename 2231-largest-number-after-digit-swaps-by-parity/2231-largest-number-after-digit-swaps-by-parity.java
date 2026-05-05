class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Character> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Character> even = new PriorityQueue<>(Collections.reverseOrder());

        char[] digits = String.valueOf(num).toCharArray();
        
        for(char c : digits) {
            if ((c-'0')%2 == 0) {
                even.offer(c);
            } else {
                odd.offer(c);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(char c: digits) {
            if ((c-'0') %2 == 0){
                sb.append(even.poll());
            } else {
                sb.append(odd.poll());
            }
        }

        
        return Integer.parseInt(sb.toString());
    }
}