package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++) {
            res.add(0, 1);
            for(int j=1; j<res.size()-1; j++) {
                res.set(j, res.get(j)+res.get(j+1));
            }
        }
        return res;
    }

    public void run() {
        int rowIndex = 3;
        List<Integer> res = getRow(rowIndex);

        System.out.println(res);
    }
}
