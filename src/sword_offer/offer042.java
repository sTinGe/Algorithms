package sword_offer;

public class offer042 {
    public String LeftRotateString(String str, int n) {
        int length = str.length();
        if (length == 0) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str);

        n = n % length;
        String cstr = sb.toString();
        return cstr.substring(n, n+length);
//        return str.substring(n, n+length);
    }

    public void run() {
        String str = "abcXYZdef";
        System.out.println(LeftRotateString(str, 6));
    }
}
