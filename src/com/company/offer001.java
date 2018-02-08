package com.company;

/**
 * Created by stinge on 22/07/2017.
 */
public class offer001 {
    public static String reverse(String str, int start, int end) {
        char [] rstr = str.toCharArray();
        while(start < end) {
            char ch = rstr[start];
            rstr[start] = rstr[end];
            rstr[end] = ch;
            start++;
            end--;
        }
//        System.out.println(rstr);
        return String.valueOf(rstr);
    }

//    // simple way
//    public static String reverseWords(String s) {
//        String[] splitedWords = s.split("\\s+");
//        String answer = "";
//        for (int i=splitedWords.length-1; i>=0; i--) {
//            answer += splitedWords[i]+" ";
//        }
//        return answer.trim();
//    }

    public static void main(String[] args) {
        String str = "student. a am I";
//        System.out.println(reverseWords(str));
        int len = str.length();

//        String rstr = reverse(str, 0, len-1);
//        System.out.println(rstr);
        int start = 0;
        int end = 0;
        char[] rarr = str.toCharArray();
        while(end < str.length()) {
            if (rarr[start] == ' ') {
                start++;
                end++;
            } else if (rarr[end] == ' ') {
                str = reverse(str, start, --end);
                end = end+1;
                start = end;
//                end++;
            } else {
                end++;
            }
//            System.out.println(rstr);
//            System.out.println(start+" "+end);
        }
        System.out.println(reverse(str, 0, str.length()-1));
    }
}
