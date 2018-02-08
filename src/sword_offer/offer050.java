package sword_offer;

public class offer050 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length == 0) return B;
        int temp = 1;
        B[0] = 1;
        for(int i=1; i<A.length; i++) {
            B[i] = A[i-1]*B[i-1];
        }
        for(int j=A.length-2; j>=0; j--) {
            temp *= A[j+1];
            B[j] *= temp;
        }
        return B;
    }
    public void run() {
        int[] A = {5,4,2,1,3,5,6,8,5,3};
        int[] B = multiply(A);
        for(int num: B) {
            System.out.print(num+",");
        }
    }
}
