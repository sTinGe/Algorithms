package leetcode;

public class lc_283 {
    public void moveZeros(int[] nums) {
        int index = 0;
        for(int num: nums) {
            if (num != 0) nums[index++] = num;
        }
        while(index < nums.length) {
            nums[index++] = 0;
        }

        for(int num: nums) {
            System.out.print(num+",");
        }
    }

    public void run() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeros(nums);
    }
}
