package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();
        res.append(((numerator<0) ^ (denominator<0)) ? "-" : "");
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);

        // integer part
        res.append(n/d);
        n %= d;
        if (n == 0) {
            return res.toString();
        }

        // fractional part
        res.append(".");
        Map<Long, Integer> map = new HashMap<>();
        map.put(n, res.length());
        while(n != 0) {
            n *= 10;
            res.append(n/d);
            n %= d;
            if (map.containsKey(n)) {
                int index = map.get(n);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(n, res.length());
            }
        }

        return res.toString();

    }

    public void run() {
        int numerator = 1, denominator = 5;
        System.out.println(fractionToDecimal(numerator, denominator));
    }
}
