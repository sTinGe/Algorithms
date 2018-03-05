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

    public boolean isPalindrome2(int x) {
        int res = 0;
        if (x < 0 || (x != 0 && x%10 == 0)) return false;

        while(x > res) {
            res = res*10 + x%10;
            x /= 10;
        }

        return (res == x || res/10 == x);
    }

    public void run() {
        System.out.println(isPalindrome(-2147483648));
    }
}
