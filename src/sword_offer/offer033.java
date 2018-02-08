package sword_offer;

public class offer033 {
    public int FirstNotRepeatingChar(String str) {
        int chars[] = new int['z'+1];
        for(int i='A'; i<='z'; i++) {
            chars[i] = 0;
        }

        char[] strChars = str.toCharArray();

        for (char strChar : strChars) {
            chars[(int) strChar]++;
        }
        for(int i=0; i<strChars.length; i++) {
            if (chars[strChars[i]] == 1) {
                return i;
            }
        }
        return -1;
    }

    public void run() {
        String str = "google";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
