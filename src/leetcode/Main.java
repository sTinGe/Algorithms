package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class Main {
    public static void main(String[] args) {
        new lc_137().run();
    }
}
