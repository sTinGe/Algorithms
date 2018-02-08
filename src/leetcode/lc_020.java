package leetcode;

import java.util.Stack;

public class lc_020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char ch: chars) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }

    public void run() {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
