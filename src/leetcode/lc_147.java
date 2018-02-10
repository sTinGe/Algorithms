package leetcode;

public class lc_147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        ListNode first = new ListNode(-1);
        ListNode prev = first;

        while(current != null) {
            ListNode next = current.next;
            while(prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            // insert
            current.next = prev.next;
            prev.next = current;

            prev = first;
            current = next;
        }
        return first.next;
    }

    public void insertionSort(int[] array) {
        for(int i=1; i<array.length; i++) {
            for(int j=i; j>=1; j--) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int num: array) {
            System.out.print(num+",");
        }
    }

    public void run() {
//        int[] array = new int[]{2,4,5,1,3,5,6,7,9,8};
//        insertionSort(array);

        ListNode head = new ListNode(2);
        ListNode p = head;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(7);

        ListNode res = insertionSortList(head);
        while(res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
