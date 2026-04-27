class Solution {

    Set<String> visited = new HashSet<>();
    StringBuilder result = new StringBuilder();

    public String crackSafe(int n, int k) {

        // starting node: "000...(n-1 times)"
        String start = "0".repeat(n - 1);

        dfs(start, k);

        // append start at end
        return result.append(start).toString();
    }

    private void dfs(String node, int k) {

        for (int digit = 0; digit < k; digit++) {

            String edge = node + digit;

            if (!visited.contains(edge)) {
                visited.add(edge);

                // move window forward (drop first char)
                dfs(edge.substring(1), k);

                // add digit after recursion (post-order)
                result.append(digit);
            }
        }
    }
}