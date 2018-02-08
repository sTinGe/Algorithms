package leetcode;

public class lc_067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public void run() {
        String a = "1011010";
        String b =   "10010";
        System.out.println(addBinary(a, b));
    }
}
