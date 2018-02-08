package sword_offer;

public class offer039 {
    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        if (array.length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }

        int bitResult = 0;
        for(int num: array) {
            bitResult ^= num;
        }
        int index = findFirstNumberOf1(bitResult);
        for(int num: array) {
            if (((num >> index) & 1) == 1) {
                num1[0] ^= num;
            } else {
                num2[0] ^= num;
            }
        }

        System.out.println(num1[0]+","+num2[0]);

    }

    private int findFirstNumberOf1(int result) {
        int index = 0;
        while((result & 1) == 0) {
            result = result >> 1;
            index++;
        }
        return index;
    }

    public void run() {
        int[] array = {1,5,6,7,1,6};
        int[] num1 = {0};
        int[] num2 = {0};
        FindNumsAppearOnce(array, num1, num2);
    }
}
