package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer07 {
    static int[] record = null;
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (record == null) {
            record = new int[n+1];
        }
        record[0] = 0;
        record[1] = 1;

        for(int i=2; i<=n; i++) {
            record[i] = record[i-1]+record[i-2];
        }

        return record[n];
//        if (record == null) {
//            record = new int[n+1];
//        }
//        if (record[n-1] != 0 && record[n-2] != 0) {
//            record[n] = record[n-1]+record[n-2];
//
//        } else {
//            return Fibonacci(n-1)+Fibonacci(n-2);
//        }
    }
}
