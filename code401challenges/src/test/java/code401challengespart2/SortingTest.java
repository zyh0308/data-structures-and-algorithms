package code401challengespart2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {
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
        int[] arr = {20,18,12,8,5,-2};
        test.InsertionSort(arr);
        int[] expected = {-2, 5, 8, 12, 18, 20};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }
    @Test
    public void testInsertionSortThree() {
        Sorting test = new Sorting();
        int[] arr = {5,12,7,5,5,7};
        test.InsertionSort(arr);
        int[] expected = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }
    @Test
    public void testInsertionSortFour() {
        Sorting test = new Sorting();
        int[] arr = {2,3,5,7,13,11};
        test.InsertionSort(arr);
        int[] expected = {2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected, test.InsertionSort(arr));

    }
}