package leetcode;

public class lc_405 {
    public String toHex(int num) {
        String[] dict = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            int index = num%16;
            num >>>= 4;
            sb.insert(0, dict[index]);
        }
        return sb.toString();
    }

    public void run() {
        int num = 300;
        System.out.println(toHex(num));
    }
}
