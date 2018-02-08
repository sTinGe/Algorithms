package leetcode;

public class lc_007 {
    public int reverse(int x) {
        long res = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
        }

        x = Math.abs(x);
        while(x != 0) {
            res = res*10 + x%10;
            x /= 10;
        }

        res *= sign;
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) res;
    }

    public void run() {
        int x = 120;
        System.out.println(reverse(x));
    }
}
