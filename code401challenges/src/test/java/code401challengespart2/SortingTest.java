package code401challengespart2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {
    // test for insertion sort
    @Test
    public void testInsertionSortOne() {
        Sorting test = new Sorting();
        int[] arr = {8, 4, 23, 42, 16, 15};
        test.InsertionSort(arr);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }

    @Test
    public void testInsertionSortTwo() {
        Sorting test = new Sorting();
        int[] arr = {20, 18, 12, 8, 5, -2};
        test.InsertionSort(arr);
        int[] expected = {-2, 5, 8, 12, 18, 20};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }

    @Test
    public void testInsertionSortThree() {
        Sorting test = new Sorting();
        int[] arr = {5, 12, 7, 5, 5, 7};
        test.InsertionSort(arr);
        int[] expected = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }

    @Test
    public void testInsertionSortFour() {
        Sorting test = new Sorting();
        int[] arr = {2, 3, 5, 7, 13, 11};
        test.InsertionSort(arr);
        int[] expected = {2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }

    //test for merge sort

    @Test
    public void testMerge() {
        int actualLength[] = new int[6];
        int[] left = new int[]{4, 8, 23};
        int[] right = new int[]{15, 16, 42};
        Sorting.merge(left, right, actualLength);
        int[] expected = new int[]{4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, actualLength);
    }

    @Test
    public void mergeSortTestOne() {

        int[] actual = new int[]{8, 4, 23, 42, 16, 15};
        Sorting.mergeSort(actual);

        int[] expected = new int[]{4, 8, 15, 16, 23, 42};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestTwo() {

        int[] actual = new int[]{20,18,12,8,5,-2};
        Sorting.mergeSort(actual);

        int[] expected = new int[]{-2,5,8,12,18,20};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestThree() {

        int[] actual = new int[]{5,12,7,5,5,7};
        Sorting.mergeSort(actual);

        int[] expected = new int[]{5,5,5,7,7,12};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestFour() {

        int[] actual = new int[]{2,3,5,7,13,11};
        Sorting.mergeSort(actual);

        int[] expected = new int[]{2,3,5,7,11,13};

        assertArrayEquals(expected, actual);

    }

    //code challenges 28 quick sort test

    @Test
    public void quickSortTestOne() {

        int[] actual = new int[]{8, 4, 23, 42, 16, 15};
        Sorting.mergeSort(actual);

        int[] expected = new int[]{4, 8, 15, 16, 23, 42};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSortTestTwo() {

        int[] actual = new int[]{20, 18, 12, 8, 5, -2};
        Sorting.quickSort(actual, 0, actual.length-1);

        int[] expected = new int[]{-2, 5, 8, 12, 18, 20};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSortTestThree() {

        int[] actual = new int[]{5, 12, 7, 5, 5, 7};
        Sorting.quickSort(actual, 0, actual.length-1);

        int[] expected = new int[]{5, 5, 5, 7, 7, 12};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSortTestFour() {

        int[] actual = new int[]{2, 3, 5, 7, 13, 11};
        Sorting.quickSort(actual, 0, actual.length - 1);

        int[] expected = new int[]{2, 3, 5, 7, 11, 13};

        assertArrayEquals(expected, actual);
    }
}