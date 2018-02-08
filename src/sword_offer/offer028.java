package sword_offer;

import java.util.ArrayList;

public class offer028 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (k>input.length) return result;
        for(int i=0; i<k; i++) {
            System.out.println("index = "+i);
            HeapSort(input, i, input.length-1);
            result.add(input[i]);
        }
        return result;
    }

    private void HeapSort(int[] input, int root, int end) {
        for(int j=end; j>=root; j--) {
            int parent = (j+root-1)/2;
            if (input[parent] > input[j]) {
                int tmp = input[parent];
                input[parent] = input[j];
                input[j] = tmp;
                System.out.println("swap "+input[parent]+" and "+input[j]);
            }
        }
    }

    public void run() {
        int[] input = {9,7,8,6,4,2,3,5,1};
        System.out.println(GetLeastNumbers_Solution(input, 8));
    }
}

