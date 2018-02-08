package leetcode;

public class lc_092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;

        ListNode first = new ListNode(-1);
        first.next = head;

        ListNode last = first;
        int k = m;
        while (--k > 0) last = last.next;

        ListNode p = last.next;
        ListNode next = p.next;


        for(int i=0; i<n-m; i++) {
            p.next = next.next;
            next.next = last.next;
            last.next = next;
            next = p.next;
        }

        return first.next;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);

        head = reverseBetween(head, 2, 4);
        p = head;
        while(p != null) {
            System.out.print(p.val+"->");
            p = p.next;
        }
    }
}
