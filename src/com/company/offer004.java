package com.company;

/**
 * Created by stinge on 22/07/2017.
 */
public class offer004 {
    public static int binSearch(int A[], int n, int key) {
        int low = 0, high = n-1, mid;
        while(low <= high) {
            mid = (low+high) / 2;
            if (A[mid] == key) {
                return mid;
            }
            if (A[mid] > key) {
                low = mid+1;
            }  else {
                high = mid-1;
            }
        }
        return -1;
    }

    public int binSearchWithDivideConquer(int A[], int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low+high)/2;
        if (A[mid] == key) {
            return mid;
        } else if (A[mid] < key) {
            return binSearchWithDivideConquer(A, key, low, mid-1);
        } else {
            // A[mid] > key
            return binSearchWithDivideConquer(A, key, mid+1, high);
        }
    }
    public static void Qsort(int s[], int low, int high) {
        if (low < high) {
            int partition = Partition(s, low, high);
            Qsort(s, low, partition-1);
            Qsort(s, partition+1, high);
        }
    }

    public static int Partition(int s[], int low, int high) {
        int pivot = s[low];
        while(low < high) {
            while (low < high && pivot <= s[high]) {
                high--;
            }
            s[low] = s[high];
            while (low<high && pivot >= s[low]) {
                low++;
            }
            s[high] = s[low];
        }
        s[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] A = {7,3,4,1,99,6,10,2,6};
        Qsort(A, 0, A.length-1);
        for (int i=0; i<A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
