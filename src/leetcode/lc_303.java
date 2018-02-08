package leetcode;

public class lc_303 {
    class NumArray {
        int[] sums;
        public NumArray(int[] nums) {
            sums = new int[nums.length];
            int s = 0;
            for(int i=0; i<nums.length; i++) {
                s += nums[i];
                sums[i] = s;
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) return sums[j];
            else {
                return sums[j]-sums[i-1];
            }
        }
    }

    public void run() {
        int[] nums = new int[]{-2,0,3,-5,2,-1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0,5));
    }
}
