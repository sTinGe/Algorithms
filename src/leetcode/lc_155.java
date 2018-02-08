package leetcode;

import java.util.Stack;

public class lc_155 {
    class MinStack {

        /** initialize your data structure here. */
        private Stack<Integer> s;
        private Stack<Integer> min;
        public MinStack() {
            s = new Stack<Integer>();
            min = new Stack<Integer>();
        }

        public void push(int x) {
            s.push(x);
            if (min.isEmpty()) {
                min.push(x);
            } else {
                if (min.peek() >= x) {
                    min.push(x);
                }
            }
        }

        public void pop() {
            int val1 = s.pop();
            int val2 = min.pop();
            if (val1 != val2) {
                min.push(val2);
            }
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

    public void run() {
        MinStack obj = new MinStack();
        obj.push(0);
        obj.push(1);
        obj.push(0);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());

    }

}
