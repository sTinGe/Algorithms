package leetcode;

public class lc_367 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;

    }

    public void run() {
        int num = 60;
        System.out.println(isPerfectSquare(num));
    }
}
