package leetcode;

public class lc_075 {
    public void sortColors(int[] nums) {
        if (nums.length <= 1)return;

        // red: 0, white: 1, blue: 2
        int reds = 0, whites = 0, blues = 0;

        for(int num: nums) {
            if (num == 0) reds++;
            else if (num == 1) whites++;
            else if (num == 2) blues++;
        }

        int index=0;
        for(int i=index; i<index+reds; i++) {
            nums[i] = 0;
        }
        index += reds;
        for(int j=index; j<index+whites; j++) {
            nums[j] = 1;
        }
        index += whites;
        for(int k=index; k<index+blues; k++) {
            nums[k] = 2;
        }

        for(int num: nums) {
            System.out.println(num+",");
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void run() {
        int[] nums = new int[]{0, 0};
        sortColors(nums);
    }
}
