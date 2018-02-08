package leetcode;

public class lc_050 {
    public double myPow(double x, int n) {
        double res = 1.0;
        long p = Math.abs((long)n);

        while(p != 0) {
            if ((p & 1) == 1) {
                res *= x;
            }
            x *= x;
            p >>>= 1;
        }

        return n >= 0 ? res : 1/res;
    }

    public void run() {
        double x = 1;
        int n = -2147483648;
        System.out.println(myPow(x, n));
    }

}
