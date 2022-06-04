import java.util.*;

public class Trie {
    Node root;
    
    private class Node {
        HashMap<Character, Node> list;
        boolean end;
        
        public Node() {
            this.list = new HashMap<>();
            this.end = false;
        }
    }
    
    Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!curr.list.containsKey(ch)) {
                curr.list.put(ch, new Node());
            }
            curr = curr.list.get(ch);
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!curr.list.containsKey(ch)) {
                return false;
            }
            curr = curr.list.get(ch);
        }
        return curr.end;
    }

    public boolean startsWith(String prefix) {
        Node curr = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!curr.list.containsKey(ch)) {
                return false;
            }
            curr = curr.list.get(ch);
        }
        return true;
    }
}
