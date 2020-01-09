package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] input = {4,8,15,16,23,42};
        int key = 15;

        assertEquals(2, BinarySearch.binarySearch(input, 15));
    }


}
