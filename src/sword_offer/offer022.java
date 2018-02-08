package sword_offer;
// 二叉搜索樹的後序遍歷序列

public class offer022 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return false;
        return judge(sequence, 0, sequence.length-1);
    }
    private boolean judge(int[] seq, int low, int high) {
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
        return judge(seq, low, index-1) && judge(seq, index, high-1);
    }

    public void run() {
        int[] seq = {1,6,4,8,7}; // true
//        int[] seq = {10,4,6,7,5}; // false
        System.out.println(VerifySquenceOfBST(seq));
    }
}
