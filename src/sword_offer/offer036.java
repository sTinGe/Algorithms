package sword_offer;

public class offer036 {
    public int GetNumberOfK(int[] array, int k) {
        int count = 0;
        for (int num : array) {
            if (num == k) count++;
        }
        return count;
    }
    public void run() {
        int[] array = {0,8,0,0,0,7,6,6,6,6};
        int k = 6;
        System.out.println(GetNumberOfK(array, k));
    }
}
