package com.company;

/**
 * Created by stinge on 29/07/2017.
 */
public class Prime {
    public boolean isPrime(int n) {
        if (n%2 == 0) {
            return false;
        }
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
