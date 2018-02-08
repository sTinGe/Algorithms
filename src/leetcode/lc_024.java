package leetcode;

public class lc_024 {
    public ListNode swapPairs(ListNode head) {
        ListNode p = head;
        while(p != null) {
            p = swap(p);
        }
        return head;
    }

    public ListNode swap(ListNode node) {
        if (node.next == null) return null;

        // node && node.next != null
        ListNode next = node.next;
        int temp = node.val;
        node.val = next.val;
        next.val = temp;
        return next.next;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p.next.next = new ListNode(4);

        ListNode res = swapPairs(head);
        while(res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
