package sword_offer;

public class offer052 {
    public boolean isNumeric(char[] str) {
        boolean hasSign = false, isDecimal = false, hasE = false;
        for(int i=0; i<str.length; i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                if (i == str.length-1 || hasE) return false;
                hasE = true;
            }
            else if (str[i] == '+' || str[i] == '-') {
                if (i == str.length-1) return false;
                if (hasSign && str[i-1] != 'E' && str[i-1] != 'e') return false;
                if (!hasSign && i>0 && str[i-1] != 'E' && str[i-1] != 'e') return false;
                hasSign = true;
            }
            else if (str[i] == '.') {
                if (i == str.length-1) return false;
                if (hasE || isDecimal) return false;
                isDecimal = true;
            }
            else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }
    public void run() {
        // "+100","5e2","-123","3.1416"和"-1E-16"
        String str = "-1E-16";
        System.out.println(isNumeric(str.toCharArray()));
    }
}
