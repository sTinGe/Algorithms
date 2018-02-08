package leetcode;

public class lc_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num: nums) {
            res ^= num;
        }
        return res;
    }

    public void run() {
        int[] nums = new int[]{1,4,5,6,7,4,6,7,1};
        System.out.println(singleNumber(nums));
    }
}
