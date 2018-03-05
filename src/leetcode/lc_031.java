package leetcode;

import java.util.Arrays;

public class lc_031 {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        int index = nums.length-1;
        while(index > 0) {
            if (nums[index-1] < nums[index]) break;
            index--;
        }
        if (index == 0) {
            reverseSort(nums, 0, nums.length-1);
            return;
        }

        int val = nums[index-1];
        int k = nums.length-1;
        while(k >= index) {
            if (nums[k] > val) break;
            k--;
        }
        swap(nums, k, index-1);
        reverseSort(nums, index, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverseSort(int[] nums, int start, int end) {
        if (start > end) return;
        for(int i=start; i<=(start+end)/2; i++)
            swap(nums, i, start+end-i);
    }

    public void run() {
        int[] nums = new int[]{1,2,6,3,5,4};
        nextPermutation(nums);
    }
}
