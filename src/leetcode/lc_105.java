package leetcode;

public class lc_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    public TreeNode construct(int[] preorder, int[] inorder, int pstart, int pend, int istart, int iend) {
        if (pstart > pend || istart > iend) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[pstart]);
        for(int i=istart; i<=iend; i++) {
            if (inorder[i] == preorder[pstart]) {
                root.left = construct(preorder, inorder, pstart+1, pstart+i-istart, istart, i-1);
                root.right = construct(preorder, inorder, pstart+i-istart+1, pend, i+1, iend);
                break;
            }
        }
        return root;
    }

    public void run() {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(new lc_102().levelOrder(root));
    }
}
