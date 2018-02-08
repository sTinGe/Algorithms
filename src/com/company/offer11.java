package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer11 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
