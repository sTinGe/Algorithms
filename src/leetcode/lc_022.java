package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        track(res, "", 0, 0, n);
        return res;
    }
    public void track(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max*2) {
            System.out.println(open+" "+close);
            list.add(str);
            return;
        }

        if (open < max) track(list, str+"(", open+1, close, max);
        if (close < open) track(list, str+")", open, close+1, max);
    }
    public void run() {
        int n = 3;
        List<String> res = generateParenthesis(n);
        System.out.println(res);
    }
}
