package leetcode;

public class lc_026 {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        for(int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                nums[length++] = nums[i];
            }
        }

        return length;
    }

    public void run() {
        int[] nums = new int[]{1,1,2,2,2,2,3,4,6,7,8,8};
        System.out.println(removeDuplicates(nums));
    }
}
