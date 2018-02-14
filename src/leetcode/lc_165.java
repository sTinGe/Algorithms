package leetcode;

public class lc_165 {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);
        for(int i=0; i<length; i++) {
            Integer a = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            Integer b = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;

            int compare = a.compareTo(b);
            if (compare != 0) return compare;
        }
        return 0;
    }

    public void run() {
        String version1 = "2.2";
        String version2 = "2.105";
        System.out.println(compareVersion(version1, version2));
    }
}
