package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_089 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i< (1<<n); i++) {
            res.add(i ^ i>>1);
        }
        return res;
    }

    public void run() {
        int n = 0;
        List<Integer> res = grayCode(n);
        System.out.println(res);
    }
}
