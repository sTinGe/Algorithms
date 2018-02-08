package com.company;

import static java.lang.Math.abs;

/**
 * Created by stinge on 26/07/2017.
 */
public class offer009 {
    // n次方可以拆解成 r^n = r^(n/2)*r^(n/2)
    // if (n&0x1 == 1) r^n = r^(n/2)*r^(n/2)
    // else r^n = r^(n/2)*r^(n/2)*r
    static boolean invalidInput = false;
    public static double PowerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0) {
            return 0.0;
        }
        if (exponent == 1) {
            return base;
        }

        double result = PowerWithUnsignedExponent(base, exponent >> 1);
        result *= result;
        if ((exponent & 0x1) == 1) {
            result *= base;
        }
        return result;
    }

    public static boolean equal(double num1, double num2) {
        if ((num1-num2 > -0.0000001) && (num1-num2 < 0.0000001)) {
            return true;
        } else {
            return false;
        }
    }

    public static double Power(double base, int exponent) {
        if (equal(base, 0.0) && exponent < 0) {
            invalidInput = true;
            return 0.0;
        }

        int absExponent = abs(exponent);
        double res = PowerWithUnsignedExponent(base, absExponent);
        if (exponent < 0) {
            res = 1.0/res;
        }
        return res;
    }
}
