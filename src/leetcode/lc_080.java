package leetcode;

public class lc_080 {
    public int removeDuplicates(int[] nums) {
        int length = 2;
        for(int i=2; i<nums.length; i++) {
            if (nums[i] > nums[length-2]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }

    public void run() {
        int[] nums = new int[]{1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
