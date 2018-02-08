package sword_offer;
// 調整數組順序使奇數位於偶數前面

public class offer013 {
    public int[] reOrderArray(int[] array) {
        int length = array.length;
        int[] res = new int[length];
        int count = 0;
        for (int i=0; i<length; i++) {
            if (array[i]%2 == 1) {
                res[count++] = array[i];
            }
        }

        for(int j=0; j<length; j++) {
            if (array[j]%2 == 0) {
                res[count++] = array[j];
            }
        }
        for(int k=0; k<length; k++) {
            array[k] = res[k];
        }
        return array;
    }
}
