package sword_offer;

public class offer029 {
    public int FindGreatestSunOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int sum = array[0];
        int record = array[0];

        for(int i=1; i<array.length; i++) {
            if (sum < 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }

            record = Math.max(sum, record);
        }
        return record;
    }

    void run() {
        int[] array = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSunOfSubArray(array));
    }
}
