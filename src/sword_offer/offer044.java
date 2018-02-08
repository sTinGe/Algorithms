package sword_offer;

public class offer044 {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5) return false;

        int[] poker = new int[14];
        poker[0] = -5;

        int min = 14, max = 0;
        for(int num: numbers) {
            poker[num]++;
            if (num == 0) continue;
            if (poker[num] > 1) return false;

            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        return (max - min) < 5;
    }

    public void run() {
        int[] numbers = {0,2,3,0,5};
        System.out.println(isContinuous(numbers));
    }
}
