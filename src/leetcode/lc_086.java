package leetcode;

public class lc_086 {
    public ListNode partition(ListNode head, int x) {
        ListNode bHead = new ListNode(-1);
        ListNode sHead = new ListNode(-1);
        ListNode p = head;
        ListNode q = bHead;
        ListNode r = sHead;

        while(p != null) {
            if (p.val < x) {
                r.next = p;
                r = r.next;
            } else {
                q.next = p;
                q = q.next;
            }
            p = p.next;
        }

        q.next = null;
        r.next = bHead.next;
        return sHead.next;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(2);

        head = partition(head, 3);
        while(head != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
    }
}
