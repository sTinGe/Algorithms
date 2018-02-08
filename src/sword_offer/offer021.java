package sword_offer;
// 從上往下打印二叉樹

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class offer021 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        // BFS
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
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

    public void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(7);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(8);

        ArrayList<Integer> list = PrintFromTopToBottom(root);
        for(int num: list) {
            System.out.print(num+",");
        }
    }
}
