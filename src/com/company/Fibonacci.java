package com.company;

/**
 * Created by stinge on 29/07/2017.
 */
public class Fibonacci {
    static int[] vals;

    public static int fib(int n) {
        if (n<2) return n;
        return fib(n-1)+fib(n-2);
    }
    public static int fibD(int[] val, int n) {
        if (val[n] == -1) {
            if (n<2) {
                val[n] = n;
            } else {
                val[n] = fibD(val, n-1)+fibD(val, n-2);
            }
        }
        return val[n];

    }

    public static void main(String[] args) {
        vals = new int[] {-1, -1, -1,-1,-1,-1,-1,-1,-1,-1};

        System.out.println(fibD(vals, 6));
    }
}
