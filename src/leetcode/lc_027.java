package leetcode;

public class lc_027 {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }

    public void run() {
        int[] nums = new int[]{3,2,2,3};
        int target = 3;
        System.out.println(removeElement(nums, target));
    }
}
