package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            temp.add(0, 1);
            for(int j=1; j<temp.size()-1; j++) {
                temp.set(j, temp.get(j)+temp.get(j+1));
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }

    public void run() {
        int numRows = 3;
        List<List<Integer>> res = generate(numRows);
        for(List<Integer> list: res) {
            System.out.println(list);
        }
    }
}
