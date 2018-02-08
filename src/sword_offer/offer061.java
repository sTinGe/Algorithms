package sword_offer;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;

public class offer061 {
    int index = 0;
    ArrayList<Integer> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return null;
        TreeNode left = KthNode(pRoot.left, k);
        if (index == k) {
            System.out.println("left");
            return left;
        }
        index++;
        if (index == k) {
            System.out.println("middle");
            return pRoot;
        }
        TreeNode right = KthNode(pRoot.right, k);
        if (index == k) {
            System.out.println("right");
            return right;
        }

        return null;
    }

    int KthNode2(TreeNode pRoot, int k) {
        find(pRoot, k);
        return list.get(k-1);


    }

    void find(TreeNode pRoot, int k) {
        if (pRoot == null) return ;
        find(pRoot.left, k);
        index++;
        list.add(pRoot.val);
        if (index == k) return ;
        find(pRoot.right, k);
    }

    public void run() {
        TreeNode pRoot = new TreeNode(5);
        pRoot.left = new TreeNode(3);
        pRoot.right = new TreeNode(7);
        TreeNode left = pRoot.left;
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = pRoot.right;
        right.left = new TreeNode(6);
        right.right = new TreeNode(8);

        TreeNode node = KthNode(pRoot, 10);
        if (node == null) {
            System.out.println("null");
        } else {
            System.out.println(node.val);
        }

//        System.out.println(KthNode2(pRoot, 1));
    }
}
