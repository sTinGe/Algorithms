package leetcode;

public class lc_258 {
    public int addDigits(int num) {
        if (num == 0) return 0;

        if (num%9 == 0) return 9;
        return num%9;
    }

    public void run() {
        int num = 348;
        System.out.println(addDigits(num));
    }
}
