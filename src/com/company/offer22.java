package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if (root == null) return list;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            if (node.left != null) {
//                queue.offer(node.left);
//            }
//            if (node.right != null) {
//                queue.offer(node.right);
//            }
//            list.add(node.val);
//        }
//        return list;
//
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;

        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        return list;
    }
}
