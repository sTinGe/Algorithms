package leetcode;

public class lc_058 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int tail = s.length()-1;
        while(tail >= 0 && s.charAt(tail) == ' ') tail--;
        while(tail >= 0 && s.charAt(tail) != ' ') {
            tail--;
            length++;
        }
        return length;
    }

    public void run() {
        String s = "Hello World            ";
        System.out.println(lengthOfLastWord(s));
    }
}
