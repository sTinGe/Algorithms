package com.company;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
//    ArrayList<Integer> list1 = new ArrayList<>();
//    ArrayList<Integer> list2 = new ArrayList<>();
//
//    public void push(int node) {
//        list1.add(node);
//    }
//    public int pop() {
//        if (list1.size() == 0) {
//            throw new RuntimeException("Queue is empty");
//        }
//        if (list1.size() == 1) {
//            int node = list1.get(0);
//            list1.remove(0);
//            return node;
//        } else {
//            while(list1.size() >= 1) {
//                list2.add(list1.get(list1.size()-1));
//            }
//            int node = list1.get(0);
//            list1.remove(0);
//            while(list2.size() != 0) {
//                list1.add(list2.remove(list2.size()-1));
//            }
//            return node;
//
//        }
//    }
}
