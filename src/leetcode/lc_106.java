package leetcode;

public class lc_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    public TreeNode construct(int[] inorder, int[] postorder, int istart, int iend, int pstart, int pend) {
        if (istart > iend || pstart > pend) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[pend]);
        for(int i=istart; i<=iend; i++) {
            if (inorder[i] == postorder[pend]) {
                root.left = construct(inorder, postorder, istart, i-1, pstart, pstart+i-istart-1);
                root.right = construct(inorder, postorder, i+1, iend, pstart+i-istart, pend-1);
                break;
            }
        }
        return root;
    }

    public void run() {
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        TreeNode root = buildTree(inorder, postorder);
        System.out.println(new lc_102().levelOrder(root));
    }
}
