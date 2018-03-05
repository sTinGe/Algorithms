package leetcode;

public class lc_005 {
    int low, length;
    public String longestPalindrome(String s) {

        if (s.length() < 2) return s;

        for(int i=0; i<s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(low, low+length);
    }

    public void extendPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (k-j-1 > length) {
            low = j+1;
            length = k-j-1;
        }
    }

    public void run() {
        String s = "eacbbcaf";
        System.out.println(longestPalindrome(s));
    }
}
