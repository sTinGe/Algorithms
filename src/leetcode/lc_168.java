package leetcode;

public class lc_168 {
    public String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while(n-- > 0) {
            sb.insert(0, (char)('A'+n%26));
            n /= 26;
        }
        return sb.toString();
    }

    public void run() {
        System.out.println(convertToTitle(27));
    }
}
