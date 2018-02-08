package leetcode;

public class lc_038 {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";

        String result = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i=1; i<result.length(); i++) {
            if (result.charAt(i) != result.charAt(i-1)) {
                sb.append(count);
                sb.append(result.charAt(i-1));
                count = 1;
            } else {
                count++;
            }

            if (i == result.length()-1) {
                sb.append(count);
                sb.append(result.charAt(i));
            }
        }
        return sb.toString();
    }

    public void run() {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}
