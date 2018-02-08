package leetcode;

public class lc_029 {
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || (divisor == -1 && dividend == Integer.MIN_VALUE)) return Integer.MAX_VALUE;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long ldvd = Math.abs((long)dividend);
        long ldsr = Math.abs((long)divisor);
        int res = 0;
        while(ldvd >= ldsr) {
            long multiply = 1;
            long temp = ldsr;
            while(ldvd >= (temp<<1)) {
                temp <<= 1;
                multiply <<= 1;
            }
            ldvd -= temp;
            res += multiply;
        }
        return sign == 1 ? res : -res;
    }

    public void run() {
        int dividend = -2147483648;
        int divisor = 2;

        System.out.println(divide(dividend, divisor));
    }
}
