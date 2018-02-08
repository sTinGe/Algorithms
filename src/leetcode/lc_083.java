package leetcode;

public class lc_083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;

        while(p != null && p.next != null) {
            int val = p.val;
            ListNode tmp = p;
            while(tmp != null && val == tmp.val) {
                tmp = tmp.next;
            }

            p.next = tmp;
            p = p.next;
        }

        return head;
    }

    public void run() {
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(2);

        p = deleteDuplicates(head);

        while(p != null) {
            System.out.print(p.val+"->");
            p = p.next;
        }
    }
}
