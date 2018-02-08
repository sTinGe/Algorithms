package sword_offer;
// 旋轉數組的最小數字

public class offer006 {
    public int minNumberInRotateArray(int[] array) {
        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = (low+high)/2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}
