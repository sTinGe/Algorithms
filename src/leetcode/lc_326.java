package leetcode;

import static java.lang.Math.log10;

public class lc_326 {
    public boolean isPowerOfThree(int n) {
        double power = log10(n) / log10(3);
        return (power % 1) == 0;
    }

    public boolean isPowerOfThree2(int n) {
        int Max3PowerInt = 1162261467;
        if (n <= 0 || n > Max3PowerInt) return false;
        return Max3PowerInt % n == 0;
    }
    public void run() {
        System.out.println(isPowerOfThree(21));
    }
}
