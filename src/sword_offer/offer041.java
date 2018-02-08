package sword_offer;

import java.util.ArrayList;

public class offer041 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        // two sum
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j = array.length-1;
        while(i < j) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            } else if (array[i] + array[j] > sum) {
                j--;
            } else if (array[i] + array[j] < sum) {
                i++;
            }
        }
        return list;
    }

    public void run() {
        int[] array = {1,1,2,3,4,5,5,6,7,8,9,9,9,10,11};
        System.out.println(FindNumbersWithSum(array, 11));
    }
}
