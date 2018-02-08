package sword_offer;
// 棧的壓入、彈出序列

import java.util.Stack;

public class offer020 {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0) {
            return true;
        }

        Stack<Integer> s1 = new Stack<>();
        int i,j;
        for(i=0, j=0; i<pushA.length;) {
            s1.push(pushA[i++]);
            while(j<popA.length && s1.peek() == popA[j]) {
                s1.pop();
                j++;
            }
        }
        return s1.isEmpty();

    }

}
