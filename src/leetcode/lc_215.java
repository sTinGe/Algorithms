package leetcode;

public class lc_215 {
    public int findKthLargest(int[] nums, int k) {
        int res = 0;

        for(int i=0; i<k; i++) {
            maxHeap(nums, i, nums.length-1);
            res = nums[i];
        }
        return res;
    }

    private void maxHeap(int[] input, int root, int end) {
        for(int j=end; j>=root; j--) {
            int parent = (j+root-1)/2;

            if (input[parent] < input[j]) {
                int temp = input[parent];
                input[parent] = input[j];
                input[j] = temp;
            }
        }
    }
    public void run() {
        int[] nums = new int[]{-1, 2, 0};
        int k = 1;
        System.out.println(findKthLargest(nums, k));
    }
}
