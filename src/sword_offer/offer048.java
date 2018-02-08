package sword_offer;

public class offer048 {
    public int StrToInt(String str) {
        char[] strArray = str.toCharArray();
        int sign = 1;
        long sum = 0;
        int base = strArray.length-1;
        for(int i=0; i<strArray.length; i++) {
            char ch = strArray[i];
            if (i == 0 && ch == '+') continue;
            else if (i == 0 && ch == '-') {
                sign = -1;
                continue;
            }

            if (ch < '0' || ch > '9') return 0;
            sum += (ch-'0')*Math.pow(10, base-i);
        }

        if ((sign < 0 && sum < Integer.MIN_VALUE) || (sign > 0 && sum > Integer.MAX_VALUE)) {
            sum = 0;
        }
        return (int)sum*sign;
    }

    public void run() {
        String str = "+123";
        System.out.println(StrToInt(str));
    }
}
