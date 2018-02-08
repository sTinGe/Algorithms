package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer02 {
    public String replaceSpace(StringBuffer str) {
        int space = 0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            }
        }
        int oldIndex = str.length()-1;
        int newLength = str.length()+2*space;
        int newIndex = newLength-1;

        str.setLength(newLength);
        for(; oldIndex >= 0 && oldIndex < newIndex; --oldIndex) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
        }
//        for(; newIndex > oldIndex; oldIndex--) {
//            if (str.charAt(oldIndex) == ' ') {
//                str.setCharAt(newIndex--, '0');
//                str.setCharAt(newIndex--, '2');
//                str.setCharAt(newIndex--, '%');
//
//            } else {
//                str.setCharAt(newIndex--, str.charAt(oldIndex));
//            }
//        }
        return str.toString();
    }
}
