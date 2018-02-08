package leetcode;

import static java.lang.Math.sqrt;

public class lc_342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && ((num&(num-1)) == 0) && ((num & 0x55555555) != 0);
    }

    public void run() {
        int num = 16;
        System.out.println(isPowerOfFour(num));
    }
}
