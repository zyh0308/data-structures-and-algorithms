package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testSomeLibraryMethod() {

        int[] input = new int[]{1,2,3,4,5};
        int value = 6;
        int[] expected = new int[]{1,2,3,6,4,5};
        assertEquals("inserted value into middle of array", Arrays.toString(expected), Arrays.toString(ArrayShift.insertShiftArray(input, value)));
    }

}
