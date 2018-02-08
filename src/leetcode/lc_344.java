package leetcode;


public class lc_344 {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        return sb.reverse().toString();

    }

    public String reverseString2(String s) {
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        int low = 0, high = chars.length-1;
        while(low < high) {
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }

        for(char ch: chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public void run() {
        String s = "hello";
        System.out.println(reverseString2(s));
    }
}
