package leetcode;

public class lc_066 {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        for(int i=n; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] pone = new int[n+1];
        pone[0] = 1;
        return pone;
    }

    public void run() {
        int[] digits = new int[] {8,7};
        int[] res = plusOne(digits);
        for(int digit: res) {
            System.out.print(digit);
        }
    }
}
