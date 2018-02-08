package leetcode;

public class lc_008 {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int res = 0;

        for(char ch: chars) {
            res = res*10+(ch-'0');
        }
        return res;
    }

    public void run() {
        String str = "1234";
        System.out.println(myAtoi(str));
    }
}
