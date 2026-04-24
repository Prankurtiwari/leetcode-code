class TrieNode {
    TrieNode[] next = new TrieNode[26];
    String word;

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode p = root;

            for (char c : word.toCharArray()) {
                if (p.next[c - 'a'] == null) {
                    p.next[c - 'a'] = new TrieNode();
                }
                p = p.next[c - 'a'];
            }

            p.word = word;
        }

        return root;
    }
}

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();
        TrieNode obj = new TrieNode();
        TrieNode root = obj.buildTrie(words);
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(board, i, j, n, m, root, res);
            }
        }

        return new ArrayList<>(res);
    }

    public static void dfs(char[][] board, int i, int j, int n, int m, TrieNode root, Set<String> res) {

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] == '#') {
            return;
        }
        char c = board[i][j];
        if (root.next[c - 'a'] == null) {
            return;
        }

        root = root.next[c - 'a'];

        if (root.word != null) {
            res.add(root.word);
        }

        board[i][j] = '#';
        dfs(board, i + 1, j, n, m, root, res);
        dfs(board, i, j + 1, n, m, root, res);
        dfs(board, i - 1, j, n, m, root, res);
        dfs(board, i, j - 1, n, m, root, res);
        board[i][j] = c;
    }
}