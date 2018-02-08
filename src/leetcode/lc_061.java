package leetcode;

public class lc_061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode p = first;

        int length = 0;
        while(p.next != null) {
            p = p.next;
            length++;
        }

        if (k%length == 0) return head;
        int n = length-k%length;


        ListNode q = first;
        while(n-- > 0) {
            q = q.next;
        }

        first.next = q.next;
        q.next = null;
        p.next = head;

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

        ListNode res = rotateRight(head, 2);
        while(res != null) {
            System.out.print(res.val+",");
            res = res.next;
        }
    }
}
