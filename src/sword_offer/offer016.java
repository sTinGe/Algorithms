package sword_offer;
// 樹的子結構

class TreeNode_016 {
    int val = 0;
    TreeNode_016 left = null;
    TreeNode_016 right = null;

    public TreeNode_016(int val) {
        this.val = val;

    }
}

public class offer016 {
    public boolean HasSubtree(TreeNode_016 root1,TreeNode_016 root2) {
        boolean result = false;
        if (root1 == null || root2 == null) return false;
        if(root1.val == root2.val){
            result = IsSubTree(root1,root2);
        }

        if (!result) {
            result = HasSubtree(root1.left, root2);
        }
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
        //返回结果
        return result;
    }
    public boolean IsSubTree(TreeNode_016 root1, TreeNode_016 root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            return IsSubTree(root1.left, root2.left) && IsSubTree(root1.right, root2.right);
        }
        return false;
    }
}
