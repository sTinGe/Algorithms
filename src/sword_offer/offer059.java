package sword_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class offer059 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.add(pRoot);
        int layer = 0;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while(!queue1.isEmpty() || !queue2.isEmpty()) {
            if ((layer & 1) == 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while(!queue1.isEmpty()) {
                    TreeNode node = queue1.poll();
                    if (node != null) {
                        temp.add(node.val);
                        queue2.offer(node.left);
                        queue2.offer(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while(!queue2.isEmpty()) {
                    TreeNode node = queue2.poll();
                    if (node != null) {
                        temp.add(node.val);
                        queue1.offer(node.left);
                        queue1.offer(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                }
            }
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while(!queue.isEmpty()) {
            int length = queue.size();
            int counter = 0;
            ArrayList<Integer> temp = new ArrayList<>();
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
        return list;
    }
    public void run() {
        TreeNode pRoot = new TreeNode(0);
        pRoot.left = new TreeNode(1);
        pRoot.right = new TreeNode(2);
        TreeNode left = pRoot.left;
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        TreeNode right = pRoot.right;
        right.left = new TreeNode(5);
        right.right = new TreeNode(6);

        ArrayList<ArrayList<Integer>> list = Print2(pRoot);
        for(ArrayList<Integer> m: list) {
            System.out.println(m);
        }
    }
}
