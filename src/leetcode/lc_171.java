package leetcode;

public class lc_171 {
    public int titleToNumber(String s) {
        int res = 0;
        int base = 26;
        char[] chars = s.toCharArray();
        for(char ch: chars) {
            res = res*base + (int)ch - 'A' + 1;
        }
        return res;
    }

    public void run() {
        String s = "AAC";
        System.out.println(titleToNumber(s));
    }
}
