package leetcode;

public class lc_125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char ch: chars) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch+32));
            }
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }

        int mid = sb.length()/2;
        String a = sb.substring(0, mid);
        String b = sb.reverse().substring(0,mid);

        return a.equals(b);
    }

    public boolean isPalindrome2(String s) {
        if (s.length() == 0) return true;


        String res = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(res).reverse().toString();

        System.out.println(res+" "+rev);
        return res.equals(rev);
    }

    public void run() {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }
}
