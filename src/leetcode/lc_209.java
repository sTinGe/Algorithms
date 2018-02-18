package leetcode;

public class lc_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0, from = 0, win = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                win = Math.min(win, i - from + 1);
                sum -= nums[from++];
            }
        }
        return (win == Integer.MAX_VALUE) ? 0 : win;
    }

    public void run() {
        int s = 7;
        int[] nums = new int[]{2,3,1,2,4,10};
        System.out.println(minSubArrayLen(s, nums));
    }
}
