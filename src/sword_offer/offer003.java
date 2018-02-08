package sword_offer;

import java.util.ArrayList;
import java.util.Stack;
// 從尾到頭打印鏈表

class ListNode_003 {
    int val;
    ListNode_003 next = null;
    ListNode_003(int val) {
        this.val = val;
    }
}

public class offer003 {
    public ArrayList<Integer> printListFromTailToHead(ListNode_003 listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();

        ListNode_003 p = listNode;
        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }

        while(!s1.empty()) {
            int i = s1.pop();
            list.add(i);
        }
        return list;
    }
}
