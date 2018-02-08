package leetcode;

public class lc_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return generate(head, null);
    }
    public TreeNode generate(ListNode head, ListNode tail) {
        ListNode p = head;
        ListNode q = head;
        if (head == tail) return null;

        while(p != tail && p.next != tail) {
             p = p.next.next;
             q = q.next;
        }

        TreeNode root = new TreeNode(q.val);
        root.left = generate(head, q);
        root.right = generate(q.next, tail);
        return root;
    }

    public void run() {
        ListNode head = new ListNode(-10);
        ListNode p = head;
        p.next = new ListNode(-3);
        p = p.next;
        p.next = new ListNode(0);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(9);
        p = p.next;

        TreeNode root = sortedListToBST(head);
        System.out.println(new lc_102().levelOrder(root));
    }
}
