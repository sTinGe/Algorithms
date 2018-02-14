package leetcode;

public class lc_152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int res = nums[0];
        int max = nums[0], min = nums[0];
        for(int i=1; i<nums.length; i++) {
            int temp_M = max;
            int temp_m = min;
            max = Math.max(Math.max(temp_M*nums[i], temp_m*nums[i]), nums[i]);
            min = Math.min(Math.min(temp_m*nums[i], temp_M*nums[i]), nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public void run() {
        int[] nums = new int[]{2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
