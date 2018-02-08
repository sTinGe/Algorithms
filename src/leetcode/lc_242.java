package leetcode;

public class lc_242 {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();

        for(char ch: schars) arr[(int)(ch-'A')]++;
        for(char ch: tchars) arr[(int)(ch-'A')]--;

        for(int count: arr) {
            if (count != 0) return false;
        }
        return true;
    }

    public void run() {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
