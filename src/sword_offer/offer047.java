package sword_offer;

public class offer047 {
    public int Add(int num1, int num2) {
        while(num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public void run() {
        System.out.println(Add(5,7));
    }
}
