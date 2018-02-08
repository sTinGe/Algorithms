package leetcode;

public class lc_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

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
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);

        ListNode pHead = reverseList(head);
        while(pHead != null) {
            System.out.print(pHead.val+",");
            pHead = pHead.next;
        }
    }
}
