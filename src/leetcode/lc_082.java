package leetcode;

public class lc_082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = new ListNode(-1);
        first.next = head;

        ListNode last = first;
        ListNode p = head;

        while(p != null && p.next != null) {
            int val = p.val;
            if (val == p.next.val) {
                while(p != null && p.val == val) {
                    p = p.next;
                }
                last.next = p;
            } else {
                last = p;
                p = p.next;

            }
        }
        return first.next;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);

        head = deleteDuplicates(head);
        while(head != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
    }
}
