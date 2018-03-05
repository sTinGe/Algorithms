package leetcode;

public class lc_008 {
    public int myAtoi(String str) {
        char[] chars = str.trim().toCharArray();
        long res = 0;

        int sign = 1;
        for(int i=0; i<chars.length; i++) {
            if (i == 0 && (chars[i] == '+' || chars[i] == '-')) {
                if (chars[i] == '-') sign = -1;
                continue;
            }
            if (chars[i] < '0' || chars[i] > '9') {
                break;
            }
            res = res*10+(chars[i]-'0');

            if (res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int)res*sign;
    }

    public void run() {
        String str = "922337203685";
        System.out.println(myAtoi(str));
    }
}
