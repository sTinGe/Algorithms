package sword_offer;
// 包含min函數的棧

import java.util.Stack;

public class offer019 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> min = new Stack<>();

    Integer tmp = null;
    public void push(int node) {
        if (tmp == null) {
            tmp = node;
            s1.push(node);
            min.push(node);
        } else {
            if (tmp < node) {
                s1.push(node);
            } else {
                min.push(node);
                s1.push(node);
                tmp = node;
            }
        }
    }

    public void pop() {
        int num1 = s1.pop();
        int num2 = min.pop();
        if (num1 != num2) {
            min.push(num2);
        }
    }

    public int top() {
        int num = s1.pop();
        s1.push(num);
        return num;
    }

    public int min() {
        int num = min.pop();
        min.push(num);
        return num;
    }
}
