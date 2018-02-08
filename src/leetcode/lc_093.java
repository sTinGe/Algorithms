package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_093 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", s, 0);
        return res;
    }
    public void backtrack(List<String> res, String temp, String s, int count) {
        if (count == 4) {
            if (s.length() == 0) res.add(temp.substring(0, temp.length()-1));
            return;
        }

        for(int k=1; k<=3; k++) {
            if (s.length() < k) continue;
            int val = Integer.parseInt(s.substring(0, k));
            if (val > 255 || k != String.valueOf(val).length()) continue;
            backtrack(res, temp+s.substring(0, k)+".", s.substring(k), count+1);
        }
    }

    public void run() {
        String s = "25525511135";
        List<String> res = restoreIpAddresses(s);
        System.out.println(res);
    }
}
