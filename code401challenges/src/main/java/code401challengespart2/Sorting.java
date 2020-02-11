package code401challengespart2;

public class Sorting {
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

}
