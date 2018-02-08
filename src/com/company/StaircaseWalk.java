package com.company;

/**
 * Created by stinge on 30/07/2017.
 */
public class StaircaseWalk {
    int x = 4, y = 4;
    static int[][] c;
    static int[][] d;
    static int[] e;
    public void walk() {
        c = new int[x][y];
        for (int i = 0; i<x; i++) {
            c[0][i] = 1;
        }
        for (int j=0; j<y; j++) {
            c[j][0] = 1;
        }

        for (int i=1; i<x; i++) {
            for (int j=1; j<y; j++) {
                c[i][j] = c[i-1][j] + c[i][j-1];
            }
        }
    }

    // deprecated
    public void walk2() {
        d = new int[2][y];
        for (int i=0; i<y; i++) {
            d[0][i] = 1;
        }
        d[1][0] = 1;

        for(int i=1; i<x; i++) {
            for (int j=1; j<y; j++) {
                d[i%2][j] = d[(i-1)%2][j]+d[i%2][j-1];
            }
        }

    }

    public void walk3() {
        e = new int[y];
        for (int j=0; j<y; j++) e[j] = 1;

        for (int i=1; i<x; i++) {
            for (int j=1; j<y; j++) {
                e[j] = e[j]+e[j-1];
            }
        }
    }
    public static void main(String[] args) {
        StaircaseWalk s = new StaircaseWalk();
//        s.walk();
//        System.out.println(c[3][3]);
//        s.walk2();
//        System.out.println(d[3%2][3]);
        s.walk3();
        System.out.println(e[3]);
    }
}
