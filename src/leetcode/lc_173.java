package leetcode;

import java.util.Stack;

public class lc_173 {
    class BSTIterator {

        private Stack<TreeNode> stack;
        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            pushAll(root);
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode node = stack.pop();
            pushAll(node.right);
            return node.val;
        }

        private void pushAll(TreeNode node) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }


}
