import java.util.*;

public class Trie {
    Node root;
    
    private class Node {
        HashMap<Character, Node> list;
        int wordCount;
        int prefixCount;
        boolean end;
        
        Node() {
            this.list = new HashMap<>();
            this.wordCount = 0;
            this.prefixCount = 0;
            this.end = false;
        }
    }
    
    public Trie() {
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
            curr.prefixCount += 1;
        }
        curr.wordCount +=1;
        curr.end = true;
    }

    public int countWordsEqualTo(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!curr.list.containsKey(ch)) {
                return 0;
            }
            curr = curr.list.get(ch);
        }
        return curr.wordCount;
    }

    public int countWordsStartingWith(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!curr.list.containsKey(ch)) {
                return 0;
            }
            curr = curr.list.get(ch);
        }
        return curr.prefixCount;
    }

    public void erase(String word) {
        if (search(word)) {
            Node curr = this.root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!curr.list.containsKey(ch)) {

                }
                curr = curr.list.get(ch);
                curr.prefixCount -= 1;
            }
            curr.wordCount -=1;
            if (curr.wordCount == 0) {
                curr.end = false;
            }
        }
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
}
