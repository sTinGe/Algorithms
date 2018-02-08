package leetcode;

public class lc_013 {
    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        int[] nums = new int[s.length()];

        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }

        int sum = 0;
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] >= nums[i+1]) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }
        return sum+nums[nums.length-1];
    }

    public void run() {
        System.out.println(romanToInt("DCXXI"));
    }
}
