package leetcode;

import java.util.Stack;

public class lc_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str: tokens) {
            if (str.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            } else if (str.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            } else if (str.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            } else if (str.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

    public void run() {
        String[] tokens = new String[]{"4", "13", "5", "/", "-"};
        System.out.println(evalRPN(tokens));
    }
}
