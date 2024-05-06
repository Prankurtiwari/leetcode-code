class Node {
     Node links[] = new Node[26];
    boolean flag = false;
    
    public boolean containsKey(char c) {
        return links[c-'a'] != null;
    }
    
    public void put(char c,  Node n) {
        links[c-'a'] = n;
    }
    
    public Node get(char c) {
        return links[c-'a'];
    }
    
    public void setEnd() {
       this.flag = true;
    }
    
    public boolean isEnd() {
        return this.flag;
    }
    
    
}

class Trie {

    private static Node root;
   
    
    public Trie() {
      root = new Node();  
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int i = 0; i<word.length(); i++) {
            char c = word.charAt(i);
            if (!temp.containsKey(c)) {
                temp.put(c, new Node());
            }
            temp = temp.get(c);
        }
        temp.setEnd();
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i = 0; i<word.length(); i++) {
            char c = word.charAt(i);
            if (!temp.containsKey(c)) {
                return false;
            }
            temp = temp.get(c);
        }
        return temp.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i = 0; i<prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (!temp.containsKey(c)) {
                return false;
            }
            temp = temp.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */