package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        backtrack(root, res, new Stack<>(), sum);
        return res;
    }

    public void backtrack(TreeNode root, List<List<Integer>> res, Stack<Integer> stack, int target) {
        if (root == null) return;

        if (root.left == null && root.right == null && target == root.val) {
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(stack);
            list.add(root.val);
            res.add(list);
        } else {
            stack.push(root.val);
            backtrack(root.left, res, stack, target-root.val);
            backtrack(root.right, res, stack, target-root.val);
            stack.pop();
        }
    }

    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(10);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5); // 19
        left.right = new TreeNode(9); // 23

        TreeNode right = pRoot.right;
        right.left = new TreeNode(5); // 23
        right.right = new TreeNode(12); // 30

        int sum = 23;
        System.out.println(pathSum(pRoot, sum));
    }
}
