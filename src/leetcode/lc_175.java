package leetcode;

import java.util.Arrays;

public class lc_175 {
    // right shift
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void run() {
        int[] nums = new int[]{1,2,3,4,5};
        rotate(nums, 4);
    }
}
