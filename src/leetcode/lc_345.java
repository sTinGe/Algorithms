package leetcode;

public class lc_345 {
    public String reverseVowels(String s) {
        if (s.length() == 0) return s;

        int start = 0, end = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        while(start < end) {
            while(start < end && !vowels.contains(chars[start]+"")) {
                start++;
            }
            while(start < end && !vowels.contains(chars[end]+"")) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }

    public void run() {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
