package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc_205 {
    public boolean isIsomorphic(String s, String t) {
        int[] t1 = new int[256];
        int[] t2 = new int[256];

        for(int i=0; i<s.length(); i++) {
            if (t1[s.charAt(i)] != t2[t.charAt(i)]) return false;
            t1[s.charAt(i)] = i+1;
            t2[t.charAt(i)] = i+1;
        }
        return true;
    }

    public void run() {
        String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s, t));
    }
}
