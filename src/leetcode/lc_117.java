package leetcode;

public class lc_117 {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head = root;
        TreeLinkNode curr;
        TreeLinkNode prev;

        while(head != null) {
            curr = head;
            head = null;
            prev = null;
            while(curr != null) {
                if (curr.left != null) {
                    if (prev != null) prev.next = curr.left;
                    else head = curr.left;
                    prev = curr.left;
                }
                if (curr.right != null) {
                    if (prev != null) prev.next = curr.right;
                    else head = curr.right;
                    prev = curr.right;
                }
                curr = curr.next;

            }
        }
    }
}
