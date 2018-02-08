package sword_offer;

import java.util.ArrayList;
import java.util.Stack;

public class offer058 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int layer = 1;
        s1.push(pRoot);
        while(!s1.empty() || !s2.empty()) {
            if ((layer & 1) != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while(!s1.empty()) {
                    TreeNode node = s1.pop();
                    
                    if (node != null) {
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    System.out.println(layer+", "+temp);
                    layer++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while(!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    System.out.println(layer+", "+temp);
                    layer++;
                }
            }
        }

        return list;
    }

    public void run() {
        TreeNode pRoot = new TreeNode(5);
        pRoot.left = new TreeNode(4);
//        pRoot.right = new TreeNode(2);
        TreeNode left = pRoot.left;
        left.left = new TreeNode(3);
//        left.right = new TreeNode(2);
//        TreeNode right = pRoot.right;
//        right.left = new TreeNode(2);
//        right.right = new TreeNode(6);

        ArrayList<ArrayList<Integer>> list = Print(pRoot);
        for(ArrayList<Integer> m: list) {
            System.out.println(m);
        }
    }
}
