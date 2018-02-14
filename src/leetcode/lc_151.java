package leetcode;

public class lc_151 {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.length() < 2) return s;
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
           if (s.charAt(i) == ' ') {
               if (temp.length() != 0) {
                   res.insert(0, " "+temp.toString());
               }
               temp = new StringBuilder();
           } else {
               temp.append(s.charAt(i));
           }
        }
        if (temp.length() != 0) {
           res.insert(0, temp);
        }
        return res.toString();
    }

    public void run() {
        String s = "   a   b ";
        System.out.println(reverseWords(s));
    }
}
