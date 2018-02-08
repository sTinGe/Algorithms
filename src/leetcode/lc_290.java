package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if (strArr.length != pattern.length()) return false;

        Map<Object, Integer> map = new HashMap<>();

        for(Integer i=0; i<pattern.length(); i++) {
            if (map.put(pattern.charAt(i), i) != map.put(strArr[i], i)) {
                return false;
            }
        }


        return true;
    }

    public void run() {
        String pattern = "abba";
        String str = "dog god god dog";
//        System.out.println(
                wordPattern(pattern, str);
//        );
    }
}
