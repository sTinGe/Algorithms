package leetcode;

public class lc_006 {
    public String convert(String s, int nRows) {
        StringBuilder[] sb = new StringBuilder[nRows];
        for(int k=0; k<nRows; k++) {
            sb[k] = new StringBuilder();
        }
        int i=0;
        while(i < s.length()) {
            for(int idx=0; idx<nRows && i < s.length(); idx++) {
                sb[idx].append(s.charAt(i++));
            }
            for(int idx=nRows-2; idx>=1 && i < s.length(); idx--) {
                sb[idx].append(s.charAt(i++));
            }
        }

        for(int j=1; j<nRows; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }

    public void run() {
        String s = "PAYPALISHIRING";
        int nRows = 3;
        System.out.println(convert(s, nRows));
    }
}
