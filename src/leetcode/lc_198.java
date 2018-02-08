package leetcode;

public class lc_198 {
    public int rob(int[] nums) {
        int rob = 0;
        int not_rob = 0;

        for(int num: nums) {
            int temp = Math.max(rob, not_rob);
            rob = num+not_rob;
            not_rob = temp;
        }
        return Math.max(rob, not_rob);
    }

    public void run() {
        int[] nums = new int[]{1,3,4,5,8,9};
        System.out.println(rob(nums));
    }
}