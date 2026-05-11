class Solution {
    public int[] asteroidCollision(int[] asts) {
        Stack<Integer> st = new Stack<>();
        for(int a : asts) {
            if (a >0) {
                st.push(a);
            } else {
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(a) > st.peek()) {
                    st.pop();
                }

                if (st.isEmpty() || st.peek() <0) {
                    st.push(a);
                }

                if (st.peek() == Math.abs(a)) {
                    st.pop();
                }
            }
        }

        int[] ans = new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()) {
            ans[i--] = st.pop();
        }
        return ans;
    }
}