package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int length = queue.size();
            while(length-- > 0) {
                TreeNode node = queue.poll();
                if (length == 0) res.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return res;
    }

    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }

    public void rightView(TreeNode current, List<Integer> res, int depth) {
        if (current == null) return;

        if (depth == res.size()) {
            res.add(current.val);
        }
        rightView(current.right, res, depth+1);
        rightView(current.left, res, depth+1);
    }

    public void run() {
        TreeNode root = new TreeNode(1);
        TreeNode p = root;
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
//        p.left.right = new TreeNode(5);
//
        p.right = new TreeNode(3);
//        p.right.right = new TreeNode(4);
        System.out.println(rightSideView2(root));
    }
}
