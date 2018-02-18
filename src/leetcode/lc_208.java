package leetcode;

public class lc_208 {
    class TrieNode {
        public char val;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }

    class Trie {

        private TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode(' ');
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for(int i=0; i<word.length(); i++) {
                char ch = word.charAt(i);
                if (node.children[ch - 'a'] == null) {
                    node.children[ch - 'a'] = new TrieNode(ch);
                }
                node = node.children[ch - 'a'];
            }
            node.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for(int i=0; i<word.length(); i++) {
                char ch = word.charAt(i);
                if (node.children[ch - 'a'] == null) return false;
                node = node.children[ch - 'a'];
            }
            return node.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(int i=0; i<prefix.length(); i++) {
                char ch = prefix.charAt(i);
                if (node.children[ch - 'a'] == null) return false;
                node = node.children[ch - 'a'];
            }
            return true;
        }
    }

    public void run() {
        Trie obj = new Trie();
        obj.insert("apple");
        System.out.println(obj.search("apple"));
        System.out.println(obj.startsWith("apdr"));
    }
}
