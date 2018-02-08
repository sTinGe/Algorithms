package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        traversal(res, root);
        return res;
    }

    public void traversal(List<Integer> res, TreeNode root) {
        if (root == null) return;

        traversal(res, root.left);
        res.add(root.val);
        traversal(res, root.right);
    }

    public void run() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        root.right = new TreeNode(12);

        List<Integer> res = inorderTraversal(root);
        System.out.println(res);
    }
}
