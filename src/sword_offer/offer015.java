package sword_offer;
// 合併兩個排序的鏈表

class ListNode_015 {
    int val;
    ListNode_015 next = null;

    ListNode_015(int val) {
        this.val = val;
    }
}

public class offer015 {
    public ListNode_015 Merge(ListNode_015 list1,ListNode_015 list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
