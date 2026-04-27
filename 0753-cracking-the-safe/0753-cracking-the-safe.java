class Solution {
    StringBuilder res = new StringBuilder();
    Set<String> visited = new HashSet<>();
    public String crackSafe(int n, int k) {

        String start = "0".repeat(n-1);

        dfs(start, k);

        return res.append(start).toString();
        
    }

    public void dfs (String start, int k) {

        for(int i =0; i<k ;i++) {

            String node = start + i;

            if (!visited.contains(node)) {
                visited.add(node);
                dfs(node.substring(1), k);
                res.append(i);
            }
        }
    }
}