package sword_offer;

public class offer051 {
    public boolean match(char[] str, char[] pattern) {

        int sindex = 0, pindex = 0;
        return matchCore(str, sindex, pattern, pindex);
    }
    private boolean matchCore(char[] str, int sindex, char[] pattern, int pindex) {
        if (sindex == str.length && pindex == pattern.length) {
            return true;
        }
        if (sindex != str.length && pindex == pattern.length) {
            return false;
        }
        // pattern
        if (pindex+1 < pattern.length && pattern[pindex+1] == '*') {
            // check str
            if ((sindex < str.length && str[sindex] == pattern[pindex]) || (sindex < str.length && pattern[pindex] == '.')) {
                return matchCore(str, sindex, pattern, pindex+2) ||
                        matchCore(str, sindex+1, pattern, pindex+1) ||
                        matchCore(str, sindex+1, pattern, pindex);
            }
            // skip a*
            else {
                return matchCore(str, sindex, pattern, pindex+2);
            }
        }
        if (sindex < str.length && str[sindex] == pattern[pindex] || sindex < str.length && pattern[pindex] == '.') {
            return matchCore(str, sindex+1, pattern, pindex+1);
        }
        return false;
    }

    public void run() {
        char[] str = {};
        char[] pattern = {'.'};
        System.out.println(match(str, pattern));
    }
}
