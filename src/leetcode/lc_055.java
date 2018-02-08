package leetcode;

public class lc_055 {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i=0; i<nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }

    public void run() {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
