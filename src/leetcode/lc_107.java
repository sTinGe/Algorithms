package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            int counter = 0;
            List<Integer> temp = new LinkedList<>();
            while(counter++ < length) {
                TreeNode node = queue.poll();
                if (node != null) {
                    temp.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (!temp.isEmpty()) {
                list.add(temp);
            }
        }

        Collections.reverse(list);
        return list;
    }

    public void run() {
        TreeNode pRoot = new TreeNode(8);
        pRoot.left = new TreeNode(6);
        pRoot.right = new TreeNode(6);

        TreeNode left = pRoot.left;
        left.left = new TreeNode(5);

        TreeNode right = pRoot.right;
        right.right = new TreeNode(5);

        levelOrderBottom(pRoot);
    }
}
