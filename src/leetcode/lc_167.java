package leetcode;

public class lc_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0, high = numbers.length-1;

        while(low < high) {
            if (numbers[low]+numbers[high] == target) {
                res[0] = low+1;
                res[1] = high+1;
                return res;
            } else if (numbers[low]+numbers[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        return res;
    }

    public void run() {
        int[] numbers = new int[]{2,11,7,15};
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println(res[0]+","+res[1]);
    }
}
