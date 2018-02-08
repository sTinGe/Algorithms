package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer13 {
    public int[] reOrderArray(int[] array) {
//        int length = array.length;
//        int[] res = new int[length];
//        int count = 0;
//        for (int i=0; i<length; i++) {
//            if (array[i]%2 == 1) {
//                res[count++] = array[i];
//            }
//        }
//
//        for(int j=0; j<length; j++) {
//            if (array[j]%2 == 0) {
//                res[count++] = array[j];
//            }
//        }
//        return res;
//        if(array.length==0||array.length==1) return;
        int oddCount=0,oddBegin=0;
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) oddCount++;
        }
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) newArray[oddBegin++]=array[i];
            else newArray[oddCount++]=array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]=newArray[i];
        }
        return array;
    }
}
