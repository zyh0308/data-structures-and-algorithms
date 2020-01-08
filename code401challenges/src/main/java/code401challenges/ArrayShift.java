
package code401challenges;

public class ArrayShift{
    public static int[] insertShiftArray(int[] arr, int value) {


        int n = arr.length;
        int[] newArr = new int[n + 1];


        int half = arr.length / 2 + 1;
        for (int i = 0; i < newArr.length; i++) {
            if (i < half) {
                newArr[i] = arr[i];
            } else if (i == half) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
//
        return newArr;


    }


}


