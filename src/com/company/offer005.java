package com.company;

/**
 * Created by stinge on 23/07/2017.
 */
public class offer005 {
    public static int binary1(int n) {
        int count = 0;
        while(n >= 1) {
            n = (n-1) & n;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(binary1(9));
    }
}
