package com.company;

import java.util.*;

/**
 * Created by stinge on 06/08/2017.
 */
public class trend01 {
    public String solution1(String S, String C) {
        String domain = "@"+C.toLowerCase()+".com";
        String[] nameList = S.split(";");
        String[] mailList = new String[nameList.length];
        for (int i=0; i<nameList.length; i++) {
            nameList[i] = nameList[i].trim();
        }

        for (int i=0; i<nameList.length; i++) {
            // split first name, middle name, last name
            String[] name = nameList[i].split(" ");
            for(int j=0; j<name.length; j++) {
                // replace hyphens
                name[j] = name[j].replaceAll("-", "");
            }

            String prefix = "";
            if (name.length > 2) {
                String middle = name[1].toLowerCase();
                prefix = name[2].toLowerCase()+"_"+name[0].toLowerCase()+"_"+middle.charAt(0);
            } else {
                prefix = name[1].toLowerCase()+"_"+name[0].toLowerCase();
            }
            mailList[i] = prefix;
        }

        addDomain(mailList, domain);

        String joined = String.join("; ", mailList);
        return joined;

    }
    // add domain
    private void addDomain(String[] mailList, String domain) {

        for(int i=mailList.length-1; i>0; i--) {
            // includes itself
            int count = 1;
            String name = mailList[i];

            for(int j=i-1; j>=0; j--) {
                if (mailList[j].equals(name)) count++;
            }

            if (count > 1) {
                mailList[i] += ""+count;
            }
            mailList[i] += domain;
        }
        mailList[0] += domain;
    }


    // M 樓層
    // X 最大人數
    // Y 最大負重
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        // write your code in Java SE 8
        if (A.length <= 0) return 0;

        int num = 0;
        int floors = 0;
        int capacity = 0;
        int weight = 0;
        boolean arrived[] = new boolean[M+1];
        for(int i=0; i<arrived.length; i++) {
            arrived[i] = false;
        }

        for (int i=0; i<A.length; i++) {
            int w = A[i];
            if ((weight+w <= Y) && (capacity+1 <= X)) {
                if (!arrived[B[i]]) {
                    arrived[B[i]] = true;
                    floors++;
                }
                weight += w;
//                System.out.println("current: "+weight);
                capacity++;
            } else {
                num += floors+1;
//                System.out.println("total: "+num);
                for(int j=0; j<arrived.length; j++) {
                    arrived[j] = false;
                }
                weight = A[i];
                arrived[B[i]] = true;
                capacity = 1;
                floors = 1;
//                System.out.println("current: "+weight);
            }
        }

        num += floors+1;
        return num;
    }

//    public boolean solution3(String S, String T) {
//        // write your code in Java SE 8
//        if (S.length() != T.length()) return false;
//
//        for(int i=0; i<S.length(); i++) {
//            if (S.charAt(i) > '0' && S.charAt(i) < '9') {
//                S[i] = '?';
//            }
//        }
//    }
    public static void main(String[] args) {
//        String C = "Example";
//        String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
//        trend01 judge = new trend01();
//        System.out.println(judge.solution(S, C));

//        int A[] = new int[] {60, 80, 40};
//        int B[] = new int[] {2, 3, 5};
//        int m = 5;
//        int x = 2;
//        int y = 200;
//        trend01 judge = new trend01();
//        System.out.println(judge.solution(A, B, m, x, y));

        String a = new String("123");
        String b = new String("123");
        System.out.println(a == b);
    }
}
