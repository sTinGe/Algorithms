package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lc_116 {
    public void connect(TreeLinkNode root) {
        if (root == null) return;

        TreeLinkNode prev = root;
        while(prev.left != null) {
            TreeLinkNode node = prev;
            while(node != null) {
                node.left.next = node.right;
                if (node.next != null) node.right.next = node.next.left;
                node = node.next;
            }
            prev = prev.left;
        }

    }
}
