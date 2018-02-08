package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A {
    public String toString() {
        return "print A";
    }
}

class B extends A {
    public B() {

    }
    public String toString() {
        return super.toString()+" then print B";
    }
}

public class Overriding {

    public static void main(String[] args) {
//        B test = new B();
//        System.out.println(test);
//        List<Integer> list = new ArrayList<>();
//        Set set = new HashSet();
//
        Integer i = 10;
        Integer j = 10;
        int k = i > 10 ? 10 : i == j ? 0 : 1;

        String a = "123";
        String b = "123";
        System.out.println(a == b);
        System.out.println(k);
    }
}
