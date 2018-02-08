package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_401 {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for(int h=0; h<12; h++) {
            for(int m=0; m<60; m++) {
                if (Integer.bitCount(h*64+m) == num) {
                    list.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return list;
    }

    public void run() {
        int num = 4;
        List<String> res = readBinaryWatch(num);
        for(String timestamp: res) {
            System.out.println(timestamp);
        }
    }
}
