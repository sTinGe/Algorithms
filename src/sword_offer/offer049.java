package sword_offer;

public class offer049 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] k = new boolean[length];

        for (int i=0; i<length; i++) {
            if (k[numbers[i]]) {
              duplication[0] = numbers[i];
              return true;
            }
            k[numbers[i]] = true;
        }
        return false;
    }
    public void run() {
        int[] numbers = {};
        int[] duplication = new int[1];
        System.out.println(duplicate(numbers, numbers.length, duplication));
        System.out.println(duplication[0]);
    }
}
