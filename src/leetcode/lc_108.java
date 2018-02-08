package leetcode;

import java.util.List;

public class lc_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return convert(nums, 0, nums.length-1);
    }

    private TreeNode convert(int[] nums, int low, int high) {
        if (low > high) return null;

        int mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, low, mid-1);
        node.right = convert(nums, mid+1, high);
        return node;
    }

    public void run() {
        int[] nums = new int[]{-10, -3, 0,5,9,11,13,14,20};
        TreeNode root = sortedArrayToBST(nums);

        List<List<Integer>> list = new lc_107().levelOrderBottom(root);
        for(List<Integer> l: list) {
            System.out.println(l);
        }
    }

}
