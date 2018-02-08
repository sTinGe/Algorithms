package leetcode;

public class lc_268 {
    public int missingNumber(int[] nums) {
        int res = 0;
        int i = 0;
        for(; i<nums.length; i++) {
            res ^= (i ^ nums[i]);
        }

        return (res ^ i);
    }

    public void run() {
        int[] nums = new int[]{0,1,2,3,4,5,7,9,8};
        System.out.println(missingNumber(nums));
    }
}
