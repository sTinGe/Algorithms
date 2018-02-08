package leetcode;

public class lc_009 {
    public boolean isPalindrome(int x) {
        int c = x;
        if (c < 0) return false;

        long res = 0;
        while(c != 0) {
            res = res*10 + c%10;
            c /= 10;
        }

        if (res > Integer.MAX_VALUE) return false;
        return (res == x);
    }

    public void run() {
        System.out.println(isPalindrome(-2147483648));
    }
}
