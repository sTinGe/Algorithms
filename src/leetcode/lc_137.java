package leetcode;

public class lc_137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
            System.out.println(ones +","+twos);
        }

        return ones;
    }

    public void run() {
        int[] nums = new int[]{1,1,2,3,2,2,1,};
        System.out.println(singleNumber(nums));
    }
}
