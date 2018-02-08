package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;

//        StringBuilder sb = new StringBuilder();
//        search(root, res, sb);

        Stack<String> stack = new Stack<>();
        search2(root, res, stack);
        return res;
    }

    public void search(TreeNode root, List<String> res, StringBuilder sb) {
        if (root == null) return;
        int len = sb.length();
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            search(root.left, res, sb);
            search(root.right, res, sb);
        }
        sb.setLength(len);
    }

    public void search2(TreeNode root, List<String> res, Stack<String> stack) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            List<String> temp = new ArrayList<>(stack);
            temp.add(""+root.val);

            res.add(String.join("->", temp));
        } else {
            stack.push(""+root.val);
            search2(root.left, res, stack);
            search2(root.right, res, stack);
            stack.pop();
        }
    }
    public void run() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        List<String> res = binaryTreePaths(root);
        for(String s: res) {
            System.out.println(s);
        }
    }


}
