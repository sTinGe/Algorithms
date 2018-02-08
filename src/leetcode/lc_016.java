package leetcode;

import java.util.Arrays;

public class lc_016 {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++) {
            int low = i+1, high = nums.length-1;

            while(low < high) {
                int sum = nums[i]+nums[low]+nums[high];
                if (Math.abs(sum-target) < Math.abs(min-target)) {
                    min = sum;
                }

                if (sum >target) {
                    high--;
                } else {
                  low++;
                }
            }
        }
        return min;
    }
    public void run() {
        int[] nums = new int[]{1,1,-1,-1,3};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
