package leetcode;

public class lc_400 {
    public int findNthDigit(int n) {
        int count = 9;
        int start = 1;
        int len = 1;

        while(n > len*count) {
            n -= len*count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        // n-1: 9-10, 99-100, 999-1000,,....
        start += (n-1)/len;
        String str = Integer.toString(start);
        System.out.println(str);
        return Character.getNumericValue(str.charAt((n-1)%len));
    }

    public void run() {
        int n = 11;
        System.out.println(findNthDigit(n));
    }
}
