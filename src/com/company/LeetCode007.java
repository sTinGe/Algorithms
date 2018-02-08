package com.company;

import static java.lang.Math.abs;

/**
 * Created by stinge on 31/07/2017.
 */
public class LeetCode007 {
    public long reverse(int x) {
        boolean negative = false;
        long res = x%10;

        if (x<0) {
            negative = true;
            x *= -1;
        }

        while(x != 0){
            res += res*10 + x%10;
            x /= 10;
        }
        if ((res > 2147483647) || (res < -2147483648)) {
            return 0;
        }
        if (negative) {
            res *= -1;
        }
        return res;
    }
}
