package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc_129 {
    public int sumNumbers(TreeNode root) {
        List<Integer> sum = new ArrayList<>();
        dfs(root, sum, new Stack<>());
        int res = 0;
        for(int num: sum) {
            res += num;
        }
        return res;
//        return sum;
    }

    public void dfs(TreeNode root, List<Integer> sum, Stack<Integer> stack) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            List<Integer> list  = new ArrayList<>();
            list.addAll(stack);
            int temp = 0;
            for(int num: list) {
                temp = temp*10+num;
            }
            temp = temp*10+root.val;
            sum.add(temp);
        } else {
            stack.push(root.val);
            dfs(root.left, sum, stack);
            dfs(root.right, sum, stack);
            stack.pop();
        }
    }

    public int sumNumbers2(TreeNode root) {
        return sum(root, 0);
    }
    public int sum(TreeNode root, int s) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return s*10+root.val;
        return sum(root.left, s*10+root.val) + sum(root.right, s*10+root.val);
    }

    public void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);


        System.out.println(sumNumbers2(root));
    }
}
