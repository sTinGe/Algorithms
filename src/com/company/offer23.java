package com.company;

/**
 * Created by stinge on 02/08/2017.
 */
public class offer23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return true;
        return judge(sequence, 0, sequence.length-1);
    }

    public boolean judge(int[] seq, int low, int high) {
        if (low >= high) return true;

        int index = high;
        // 邊界 index > start
        // 條件 seq[index-1] > seq[root]
        while(index > low && seq[index-1]>seq[high]) {
            index--;
        }

        for (int j = index-1; j>=low; j--) {
            if (seq[j] > seq[high]) return false;
        }
        return judge(seq, low, index-1) && judge(seq, index+1, high);

    }
}
