package sword_offer;

import java.util.ArrayList;

public class offer040 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> sequenceList = new ArrayList<>();
        if (sum<3) return sequenceList;
        int s = (int)Math.sqrt(2*sum);
        for(int i=s; i>=2; i--) {
            if (2*sum % i == 0) {
                int d = 2*sum / i;
                if ( ((d&1) ^ (i&1)) == 1 ) {
                    int a1 = (d-i+1)/2;
                    int an = (d+i-1)/2;
                    ArrayList<Integer> temp = new ArrayList<>();
                    for(int j=a1; j<=an; j++) {
                        temp.add(j);
                    }
                    sequenceList.add(temp);
                }
            }
        }
        return sequenceList;
    }
    public void run() {
        int sum = 100;
        System.out.println(FindContinuousSequence(sum));
    }
}

