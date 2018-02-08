package leetcode;

public class lc_234 {
    public boolean isPalidrome(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while(p1.next != null && p1.next.next != null) {
            p1 = p1.next.next;
            p2 = p2.next;
        }

        ListNode rev = revert(p2.next);

        while(rev != null && head != null) {
            if (rev.val != head.val) return false;
            rev = rev.next;
            head = head.next;
        }
        return true;

    }

    public ListNode revert(ListNode head) {
        if (head == null) return null;

        ListNode prev = null;
        ListNode p = head;
        while(p != null) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        return prev;
    }

    public void run() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalidrome(head));
    }
}
