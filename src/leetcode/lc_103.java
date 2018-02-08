package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        int layer = 0;
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()) {
            if ((layer&1) == 0) {
                // s1
                List<Integer> temp = new ArrayList<>();
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    temp.add(node.val);
                    if (node.left != null) s2.add(node.left);
                    if (node.right != null) s2.add(node.right);
                }
                if (!temp.isEmpty()) {
                    res.add(temp);
                }
                layer++;
            } else {
                // s2
                List<Integer> temp = new ArrayList<>();
                while(!s2.isEmpty()) {
                    TreeNode node = s2.pop();
                    temp.add(node.val);
                    if (node.right != null) s1.add(node.right);
                    if (node.left != null) s1.add(node.left);
                }
                if (!temp.isEmpty()) {
                    res.add(temp);
                }
                layer++;
            }
        }
        return res;
    }

    public void run() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = zigzagLevelOrder(root);
        System.out.println(res);
    }

}
