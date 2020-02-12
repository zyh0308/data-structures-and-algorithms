package code401challengespart2;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

public class Sorting {

    //insertion sort code challenge 26
    public int[] InsertionSort(int [] arr){

        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        return arr;

    }


    //merge sort code challenge 27

    public static void mergeSort(int[] array) {
        int n =array.length;
        if (n>1){
            int mid =n/2;
            int [] left = Arrays.copyOfRange(array, 0, mid);
            int [] right= Arrays.copyOfRange(array,mid,n);
            Sorting.mergeSort(left);
            Sorting.mergeSort(right);
            Sorting.merge(left,right,array);


        }

    }

    public static void merge(int[] left, int[] right, int[] array) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length){
            if (left[i] <=right[j]){
                array[k] = left[i];
                i++;
            }else {
                array[k] = right[j];
                j++;
            }
            k++;

        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

    }


}
