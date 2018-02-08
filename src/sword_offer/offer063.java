package sword_offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class offer063 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0) return res;

        int until;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<num.length; i++) {
            until = i-size+1;

            if (deque.isEmpty()) {
                deque.add(i);
            } else if (until > deque.peekFirst()) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && num[deque.peekLast()] <= num[i]) {
                deque.pollLast();
            }
            deque.add(i);
            if (until >= 0) {
                res.add(num[deque.peekFirst()]);
            }
        }
        return res;
    }

    public void run() {
        int[] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        System.out.println(maxInWindows(num, size));
    }
}
