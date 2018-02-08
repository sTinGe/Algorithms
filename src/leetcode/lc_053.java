package leetcode;

public class lc_053 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int record = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            record = Math.max(record, sum);
        }
        return record;
    }

    public void run() {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
