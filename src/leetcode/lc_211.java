package leetcode;

public class lc_211 {
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

    class WordDictionary {

        TrieNode root;
        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new TrieNode(' ');
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
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

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return match(word.toCharArray(), 0, root);
        }

        private boolean match(char[] chs, int index, TrieNode node) {
            if (index == chs.length) {
                return node.isWord;
            }

            char ch = chs[index];
            if (chs[index] == '.') {
                for(int i=0; i<node.children.length; i++) {
                    if (node.children[i] != null && match(chs, index+1, node.children[i])) {
                        return true;
                    }
                }
            } else {
                return node.children[ch - 'a'] != null && match(chs, index+1, node.children[ch - 'a']);
            }
            return false;
        }
    }

    public void run() {

    }
}
