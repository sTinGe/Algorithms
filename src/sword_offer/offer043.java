package sword_offer;

public class offer043 {
    public String ReverseSentence(String str) {
        if (str.length() < 2) return str;

        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char[] strArray = str.toCharArray();
        for(int i=0; i<strArray.length; i++) {
            if (strArray[i] == ' ') {
                res.insert(0, " " + temp);
                temp = new StringBuilder();
            } else {
                temp.append(strArray[i]);
            }
        }
        if (temp.length() != 0) {
            res.insert(0, temp);
        }
        return res.toString();
    }

    public void run() {
        String str = "student. a am I";
        System.out.println(ReverseSentence(str));
    }
}
