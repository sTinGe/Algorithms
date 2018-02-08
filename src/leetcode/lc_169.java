package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class lc_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length-1)/2;
        return nums[mid];
    }

    public void run() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,9,7,7,7,7,7,7};
        System.out.println(majorityElement(nums));
    }
}
